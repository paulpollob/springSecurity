package com.learing.auth.auth.Controller;

import com.learing.auth.auth.Model.Users;
import com.learing.auth.auth.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class UserController {

    @Autowired
    private UserService service;
    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        System.out.println("hk from register: "+user);
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        System.out.println("HK user from login: "+user);

        return service.verify(user);
    }
}
