package com.sparta.post.dto;

public class BlogResponseDto {

    private Long id;
    private String title;
    private String userName;

    private String content;

    public BlogResponseDto(Long id, String title, String userName, String content) {
        this.id = id;
        this.title = title;
        this.userName = userName;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUserName() {
        return userName;
    }

    public String getContent() {
        return content;
    }
}
