package com.sparta.post.service;

import com.sparta.post.dto.BlogRequestDto;
import com.sparta.post.dto.BlogResponseDto;
import com.sparta.post.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    BlogRepository blogRepository;

    BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<BlogResponseDto> getPost() {
        return blogRepository.findAll().stream().map(BlogResponseDto::new).toList();
    }
}