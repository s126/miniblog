package fish.miniblog.controller;

import fish.miniblog.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/regist")
    public String regist (User user) {
        return "regist";
    }

    @RequestMapping("/create")
    public String create(User user, Errors errors) {

        if(user.getAge() > 100 || user.getAge() < 18) {
            errors.rejectValue("age", null, "年龄必须在 18-100 岁之间");
        }

        if(user.getName() != null && user.getName().length() < 3) {
            errors.rejectValue("name",null,"名字太短了");
        }

        errors.reject(null, "我也不知道，反正感觉你是有错误的。");

        System.out.println(user);


        if(errors.hasErrors())
            return "regist";
        else
            return "greeting";
    }

}
