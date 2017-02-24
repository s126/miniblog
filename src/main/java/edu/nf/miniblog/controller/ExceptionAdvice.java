package edu.nf.miniblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    public String xxx (Exception e, ModelMap modelMap) {
        modelMap.addAttribute("err", e.getStackTrace());
        return "error";
    }
    
}
