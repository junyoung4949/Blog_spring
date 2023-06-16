package com.sparta.post.enitiy;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Blog {
    private Long id;
    private String title;
    private String passWord;
    private String userName;
    private String content;
}