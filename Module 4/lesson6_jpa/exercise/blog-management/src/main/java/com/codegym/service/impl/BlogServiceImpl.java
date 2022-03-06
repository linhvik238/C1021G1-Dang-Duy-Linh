package com.codegym.service.impl;

import com.codegym.model.Blog;
import com.codegym.repository.IBlogRepository;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog viewBlogDetail(Long id) {
        return blogRepository.viewBlogDetail(id);
    }

    @Override
    public void createBlog(Blog blog) {
        blogRepository.createBlog(blog);
    }

    @Override
    public void edit(Blog blog) {
        blogRepository.edit(blog);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public List<Blog> search(String header) {
        return blogRepository.search(header);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }
}
