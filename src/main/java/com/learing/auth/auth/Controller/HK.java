package com.learing.auth.auth.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HK {

    @GetMapping("/hk")
    public String hk(HttpServletRequest request) {
        return "hk"+request.getSession().getId();
    }

}
