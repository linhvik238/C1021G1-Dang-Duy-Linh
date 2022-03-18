package com.codegym.blogmanagement.controller;

import com.codegym.blogmanagement.model.Blog;
import com.codegym.blogmanagement.model.Category;
import com.codegym.blogmanagement.service.IBlogService;
import com.codegym.blogmanagement.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping({"/blog", "/home", ""})
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @RequestMapping (value="list", method = RequestMethod.GET)
    public ModelAndView showBlogs(@PageableDefault (value = 2, sort = "dateCreated",
            direction =Sort.Direction.ASC) Pageable pageable) {
        return new ModelAndView("blog", "blogList", blogService.findAll(pageable));
    }

    @RequestMapping("/create-blog")
    public String showCreateForm(Model model, @PageableDefault(size = 5) Pageable pageable) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping ("/create-blog")
    public String create(RedirectAttributes redirect, Blog blog) {
        blog.setDateCreated(String.valueOf(new Date().getTime()));
        blogService.createBLog(blog);
        redirect.addFlashAttribute("message", "Created new blog successfully!");
        return "redirect:/list";
    }

    @GetMapping ("/view-blog/{title}")
    public String listBlogByTitle(@PathVariable String title, @PageableDefault Pageable pageable, Model model) {
        Page<Blog> blog = blogService.findAllByTitleContaining(title, pageable);
        model.addAttribute("blog", blog);
        return "view";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PageableDefault Pageable pageable, @PathVariable Long id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        List<Category> categories = categoryService.findAll();
        model.addAttribute("category", categories);
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(Blog blog) {
        System.out.println(126663);
        blogService.edit(blog);
        System.out.println(123);
        System.out.println(categoryService.findAll().size());
        return "redirect:/blog/list";
    }

    @GetMapping("/search")
    public String search (@RequestParam String title, @PageableDefault Pageable pageable, Model model) {
        Page<Blog> blogList = blogService.findAllByTitleContaining(title, pageable);
        model.addAttribute("blogList", blogList);
        return "search";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        blogService.deleteBlog(id);
        return ("redirect:/blog/list");
    }
}
