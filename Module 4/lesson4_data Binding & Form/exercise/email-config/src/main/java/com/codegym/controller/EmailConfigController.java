package com.codegym.controller;

import com.codegym.model.EmailConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailConfigController {

    @GetMapping ("/list")
    public ModelAndView list (){
        return new ModelAndView("list", "mail", new EmailConfiguration());
    }

    @PostMapping("/create")
    public ModelAndView update (@ModelAttribute("mail") EmailConfiguration emailConfiguration) {
        ModelAndView modelAndView = new ModelAndView("result","mail",new EmailConfiguration());
        modelAndView.addObject("languages", emailConfiguration.getLanguages());
        modelAndView.addObject("pageSize", emailConfiguration.getPageSize());
        modelAndView.addObject("spamFilter", emailConfiguration.getSpamFilter());
        modelAndView.addObject("signature", emailConfiguration.getSignature());
        return modelAndView;



    }





}
