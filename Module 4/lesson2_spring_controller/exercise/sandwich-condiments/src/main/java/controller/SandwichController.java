package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    ModelAndView modelAndView;

    @GetMapping("")
    public String showList() {
        return "choice";
    }

    @PostMapping("/select")
    public ModelAndView select(@RequestParam (name = "condiment", defaultValue = "abc")String[] condiment) {
        if (!condiment[0].equals("abc")) {
            modelAndView = new ModelAndView("choice", "list", condiment);
        } else {
            modelAndView = new ModelAndView("choice", "list", "Ăn sandwich mà ko có topping, " +
                    "thông minh lên đi gia đình chờ");
        }
        return modelAndView;
    }
}
