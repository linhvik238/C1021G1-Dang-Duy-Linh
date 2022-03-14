package com.codegym.springusermanagement.controller;

import com.codegym.springusermanagement.model.User;
import com.codegym.springusermanagement.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("/")
    public ModelAndView getFormRegister() {
        return new ModelAndView("register", "user", new User());
    }

    @PostMapping("/register")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        userService.create(user);
        model.addAttribute("user", user);
        return "success";

//            userService.create(user);
//            redirect.addFlashAttribute("message", "Đăng ký tài khoàn thành công!");
//            return "redirect:/success";
//        }
    }
}
