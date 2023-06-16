package com.sparta.post.dto;

public class BlogRequestDto {

    private Long id;
    private String userName;
    private String password;
    private String content;

    public BlogRequestDto(Long id, String userName, String password, String content) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getContent() {
        return content;
    }
}
