package com.codegym.blogmanagement.service;

import com.codegym.blogmanagement.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void createBLog (Blog blog);
    List<Blog> findAllByTitleContaining(String title);
    void deleteBlog(Long id);
}
