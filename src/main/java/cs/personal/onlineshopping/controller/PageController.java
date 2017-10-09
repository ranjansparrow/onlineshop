package cs.personal.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping(value = {"/","/home","/index"})
    public String welcome(Model model){
        model.addAttribute("greeting","Welcome To Goa Singham");
        return "home";
    }

}
