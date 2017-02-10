package fish.miniblog.controller;

import fish.miniblog.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController {

    // 显示所有用户
    @RequestMapping(method = RequestMethod.GET)
    public String index(User user) {
        return "index";
    }

    // 进入注册页面
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(User user) {
        return "regist";
    }

    // 添加新的用户
    @RequestMapping(method = RequestMethod.POST)
    public String create(User user) {
        return "index";
    }

    // 显示某个用户信息
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(@PathVariable int id) {
        return "show";
    }

    // 进入编辑用户页面
    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable int id) {
        return "edit";
    }

    // 更新用户信息
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String update (@PathVariable int id) {
        return null;
    }

    // 删除用户
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete (@PathVariable int id) {
        return null;
    }

}
