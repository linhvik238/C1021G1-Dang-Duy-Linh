package com.codegym.blogmanagement.service.impl;

import com.codegym.blogmanagement.model.Blog;
import com.codegym.blogmanagement.repository.IBlogRepository;
import com.codegym.blogmanagement.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository repository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void createBLog(Blog blog) {
        repository.save(blog);
    }

    @Override
    public List<Blog> findAllByTitleContaining(String title) {
        return repository.findAllByTitleContaining(title);
    }

    @Override
    public void deleteBlog(Long id) {
        repository.deleteById(id);
    }
}
