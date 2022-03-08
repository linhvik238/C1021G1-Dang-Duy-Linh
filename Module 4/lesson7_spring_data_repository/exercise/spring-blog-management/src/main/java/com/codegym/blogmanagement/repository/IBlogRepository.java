package com.codegym.blogmanagement.repository;

import com.codegym.blogmanagement.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository <Blog, Long> {
    Blog viewByName (String name);
}
