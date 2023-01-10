package be.bstorm.akimts.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // afficher la vue message
    // GET - http://localhost:8080/message
    @GetMapping("/message")
    public String message(Model model){
        model.addAttribute("msg", "voici mon message :)");
        return "message";
    }

}
