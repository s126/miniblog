package fish.miniblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/index")
    public String index(Model model) {
        System.out.println("hello, 我要抛异常啦！");
        throw new MyException();
    }
}


// 创建我们自己的异常，类型为 MyException
class MyException extends RuntimeException {
}
class YourException extends RuntimeException {
}

