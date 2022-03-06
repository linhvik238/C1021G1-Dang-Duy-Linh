package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("/blogs")
    public ModelAndView listBlogs() {
        List<Blog> blogList = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("blog/home");
        modelAndView.addObject("blogs", blogList);
        return modelAndView;
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView viewBlogDetail(@PathVariable Long id) {
        Blog blog = blogService.viewBlogDetail(id);
        ModelAndView modelAndView = new ModelAndView("blog/viewDetail");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public String createBlog(Blog blog) {
        blogService.createBlog(blog);
        return "redirect:/blogs";
    }

    @GetMapping ("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog",blog);
        return "blog/edit";
    }

    @PostMapping ("/edit")
    public String edit (Blog blog) {
        blogService.edit(blog);
        return "redirect:/blogs";
    }

    @PostMapping("/blogs/{header}")
    public String search(@PathVariable String header, RedirectAttributes attributes){
        List<Blog> blogList = blogService.search(header);
        attributes.addFlashAttribute( "blogList", blogList);
        return "redirect:/blogs";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        blogService.remove(id);
        return ("redirect:/blogs");
    }
}
