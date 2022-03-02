package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyExchange {
    @GetMapping ("/home")
    public String home() {
        return "home";
    }

    @PostMapping ("/home")
    public String calculate(@RequestParam double usd, double rate, Model model) {

        double vnd = usd * rate;
        model.addAttribute("vnd", vnd);
        return "home";
    }
}
