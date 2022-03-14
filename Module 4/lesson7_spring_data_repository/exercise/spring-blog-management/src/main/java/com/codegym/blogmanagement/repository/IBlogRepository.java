package com.codegym.blogmanagement.repository;

import com.codegym.blogmanagement.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IBlogRepository extends JpaRepository <Blog, Long> {
    List<Blog> findAllByTitleContaining(String title);
}
