package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    @ResponseBody
    public String helloHandler()
    {
        return "<h1>Hello, World!</h1>";
    }
}