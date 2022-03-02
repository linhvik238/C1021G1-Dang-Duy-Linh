package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;
import java.util.Map;

@Controller
public class Dictionary {
    Word word = new Word();
    Map<String, String> dictionaryMap = word.dictionary();

    @GetMapping ("/")
    public String home () {
        return "home";
    }

    @GetMapping("/home")
    public String resultSearch(@RequestParam String english, Model model) {
        for (Map.Entry<String, String> listWord : dictionaryMap.entrySet()) {
            if (listWord.getKey().toLowerCase().equals(english.toLowerCase())) {
                model.addAttribute("result", listWord.getValue());
            } else {
                model.addAttribute("message", "Does not found search word!");
            }
        }
        return "home";
    }
}
