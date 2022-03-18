package com.codegym.blogmanagement.service;

import com.codegym.blogmanagement.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void createBLog (Blog blog);
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
    void deleteBlog(Long id);
    void edit(Blog blog);
    Blog findById(Long id);
}
