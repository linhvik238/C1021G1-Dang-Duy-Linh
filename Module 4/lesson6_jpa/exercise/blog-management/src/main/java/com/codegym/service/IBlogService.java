package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface IBlogService {
    public List<Blog> findAll();
    public Blog viewBlogDetail(Long id);
    public void createBlog (Blog blog);
    void edit (Blog blog);
    Blog findById(Long id);
    public List<Blog> search(String header);
    public void remove(Long id);
}
