package com.codegym.repository;

import com.codegym.model.Blog;

import java.util.List;

public interface IBlogRepository {
    public List<Blog> findAll();
    public Blog viewBlogDetail(Long id);
    public void createBlog (Blog blog);
    public void edit (Blog blog);
    Blog findById(Long id);
    public List<Blog> search(String header);
    public void remove(Long id);
}
