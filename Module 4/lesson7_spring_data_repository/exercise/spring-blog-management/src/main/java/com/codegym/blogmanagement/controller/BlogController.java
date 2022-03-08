package com.codegym.blogmanagement.controller;

import com.codegym.blogmanagement.model.Blog;
import com.codegym.blogmanagement.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/blog", "/home", ""})
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @RequestMapping (value="list", method = RequestMethod.GET)
    public ModelAndView showBlogs(@PageableDefault (value = 2, sort = "dateCreated",
            direction =Sort.Direction.ASC) Pageable pageable) {
        return new ModelAndView("blog", "blogList", blogService.findAll(pageable));
    }

    @RequestMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping ("/create-blog")
    public String create(RedirectAttributes redirect, Blog blog) {
        blogService.createBLog(blog);
        redirect.addFlashAttribute("message", "Created new blog successfully!");
        return "redirect:/list";
    }

    @GetMapping ("/view/{name}")
    public String viewBlog () {

    }


}
