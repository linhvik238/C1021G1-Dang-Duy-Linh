package com.codegym.blogmanagement.service.impl;

import com.codegym.blogmanagement.model.Blog;
import com.codegym.blogmanagement.repository.IBlogRepository;
import com.codegym.blogmanagement.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository repository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Blog createBLog(Blog blog) {
        return repository.save(blog);
    }

    @Override
    public Blog viewByName(String name) {
        return repository.viewByName(name);
    }
}
