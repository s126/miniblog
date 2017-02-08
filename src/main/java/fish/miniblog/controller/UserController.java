package fish.miniblog.controller;

import fish.miniblog.model.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/users")
public class UserController {

    @InitBinder
    public void init (WebDataBinder binder) {
        binder.registerCustomEditor(
                Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }

    @RequestMapping("/regist")
    public String regist (User user) {
        return "regist";
    }

    @RequestMapping("/create")
    public String create(@Valid User user, Errors errors) {

        System.out.println(user);

        if(errors.hasErrors())
            return "regist";
        else
            return "greeting";
    }

}
