package com.myblog1.service;

import com.myblog1.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);

    List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);


    PostDto findPost(long id);
}
