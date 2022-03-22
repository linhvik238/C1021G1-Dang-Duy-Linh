package com.codegym.blogmanagement.controller;

import com.codegym.blogmanagement.model.Category;
import com.codegym.blogmanagement.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;

    @RequestMapping("create-category")
    public String showCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "category/add";
    }

    @GetMapping("/list")
    public String findAll(@PageableDefault (size = 3)Pageable pageable, Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categoryList", categories);
        return "category/list";
    }

    @PostMapping("create-category")
    public String create(Category category) {
        categoryService.create(category);
        return "redirect:/category/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Category category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "category/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("category") Category category) {
        categoryService.edit(category);
        return "redirect:/category/list";
    }
}

