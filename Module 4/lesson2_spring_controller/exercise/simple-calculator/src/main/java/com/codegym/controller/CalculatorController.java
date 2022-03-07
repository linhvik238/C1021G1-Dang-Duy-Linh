package com.codegym.controller;

import com.codegym.service.impl.CalculatorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/calculate")
    public String showCalculator(){
        return "home";
    }
    @PostMapping("/calculate")
    public ModelAndView sandWich(@RequestParam(required = false) double num1,double num2,String calculate){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        ModelAndView modelAndView = new ModelAndView("result");
        String result = calculatorService.Calculate(num1,num2,calculate);
        modelAndView.addObject("result",result);

        return modelAndView;

    }
}
