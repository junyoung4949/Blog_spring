package com.sparta.post.dto;

import com.sparta.post.enitiy.Blog;
import lombok.Getter;
import lombok.Setter;

@Getter
public class BlogResponseDto {

    private Long id;
    private String title;
    private String userName;
    private String content;

    private String massage;

    public BlogResponseDto(Long id, String title, String userName, String content) {
        this.id = id;
        this.title = title;
        this.userName = userName;
        this.content = content;
    }

    public void SetMassage(String massage) {
        this.massage = massage;
    }

    public BlogResponseDto(Blog blog) {
        this.id = blog.getId();
        this.title = blog.getTitle();
        this.userName = blog.getUserName();
        this.content = blog.getContent();
    }
}
