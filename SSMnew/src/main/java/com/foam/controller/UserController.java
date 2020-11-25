package com.foam.controller;



import com.foam.entity.User;
import com.foam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller("userController")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password , Model model){
        System.out.println(username+":"+password);
        User user = userService.login(username,password);
        System.out.println(user);
        if(user!=null){
            model.addAttribute("hallo",username);
            return "hallo";
        }else {
            model.addAttribute("fail",username);
            return "fail";
        }
    }
}
