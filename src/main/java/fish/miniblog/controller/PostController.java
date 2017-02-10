package fish.miniblog.controller;

import fish.miniblog.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

    public String  index(User user, String name) {

        return "posts/index";
    }

}
