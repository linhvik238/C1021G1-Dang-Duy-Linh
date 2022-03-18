package com.codegym.blogmanagement.service;

import com.codegym.blogmanagement.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    void create(Category category);
    Category findById(Long id);
    void delete(Long id);
    void edit(Category category);
}
