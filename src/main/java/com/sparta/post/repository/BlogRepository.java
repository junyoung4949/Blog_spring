package com.sparta.post.repository;

import com.sparta.post.dto.BlogRequestDto;
import com.sparta.post.dto.BlogResponseDto;
import com.sparta.post.enitiy.Blog;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BlogRepository {

    Map<Long , Blog> store = new HashMap<>();

    public List<Blog> findAll() {
        return store.values().stream().toList();
    }
}
