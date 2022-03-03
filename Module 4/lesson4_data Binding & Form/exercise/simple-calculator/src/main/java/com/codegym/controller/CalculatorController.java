package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping ("/")
    public String home () {
        return "home";
    }

    @PostMapping ("/calculate")
    public ModelAndView calculate(@RequestParam double num1, double num2, String calculate) {
        ModelAndView modelAndView = new ModelAndView("result");
        double result = 0;
        switch (calculate) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "X":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
