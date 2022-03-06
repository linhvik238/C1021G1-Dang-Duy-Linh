package com.codegym.cotroller;

import com.codegym.model.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    @RequestMapping
    public String displayHome(Model model){
        model.addAttribute("form",new Form());
        model.addAttribute("travel",new String[]{"Máy bay","Du thuyền","Ô tô", "Tàu lửa", "Khác"});
        return "/home";
    }

    @PostMapping("/register")
    public String regist(Form form,Model model){
        String info = form.toString();
        model.addAttribute("info",info);
        return "/result";
    }
}
