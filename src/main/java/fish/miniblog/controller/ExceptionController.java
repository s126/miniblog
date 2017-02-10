package fish.miniblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler({YourException.class})
    public ModelAndView hahaha (Exception e) {
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("err", e);
        return mv;
    }

    @ExceptionHandler
    public String hahaha (MyException e) {
        return "index";
    }
}
