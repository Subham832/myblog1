package com.myblog1;
//consumer


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        List<Login> logins = Arrays.asList(
                new Login("mike", "testing"),
                new Login("stallin", "testing"),
                new Login("adam", "testing"),
                new Login("subham", "admin")
        );
        List<LoginDto> collect = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
        System.out.println(collect);

    }

    static LoginDto mapToDto(Login login) {
        LoginDto dto = new LoginDto();
        dto.setUserName(login.getUserName());
        dto.setPassword(login.getPassword());
        return dto;
    }
}
