package com.codegym.blogmanagement.service;

import com.codegym.blogmanagement.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    Blog createBLog (Blog blog);
    Blog viewByName (String name);
}
