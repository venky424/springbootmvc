package com.sample.springbootmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class HomeController {

    @GetMapping({"/", "/hello"})
    public String home(Model cmd, HttpServletRequest req, HttpServletResponse resp){
        cmd.addAttribute("message","Welcome to Spring Boot MVC");
        return "hello";
    }
}
