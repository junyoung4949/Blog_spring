package com.sparta.post.controller;

import com.sparta.post.dto.BlogResponseDto;
import com.sparta.post.enitiy.Blog;
import com.sparta.post.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {

    BlogService blogService;

    BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/posts")
    public List<BlogResponseDto> getPost() {
        return blogService.getPost();
    }
}