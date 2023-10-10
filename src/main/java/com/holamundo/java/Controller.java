package com.holamundo.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
public class Controller
{
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }

}  