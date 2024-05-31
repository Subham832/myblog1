package com.myblog1.controller;

import com.myblog1.payload.CommentDto;
import com.myblog1.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    //http://localhost:8080/api/comments?postId=1
    @PostMapping
    public ResponseEntity<CommentDto> createComment(
            @RequestBody CommentDto commentDto,
            @RequestParam long postId
    ){
        CommentDto dto = commentService.createComment(commentDto, postId);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    //http://localhost:8080/api/comments/3
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable long id){

        commentService.deleteComment(id);
        return new ResponseEntity<>("Comment is deleted!!", HttpStatus.OK);
    }
    //http://localhost:8080/api/comments/1/post/1
    @PutMapping("/{id}/post/{postId}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable long id, @RequestBody CommentDto commentDto,@PathVariable long postId){
        CommentDto dto = commentService.updateComment(id, commentDto, postId);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
