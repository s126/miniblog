package fish.miniblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "小明");
        return "greeting";
    }

}
