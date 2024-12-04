package com.springsecurity.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(HttpServletRequest request) {
        return ("<h1>Welcome to Spring Security Demo - " + request.getSession().getId()+ "</h1>");
    }
}
