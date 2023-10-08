package com.holamundo.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
public class Router
{
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/home")
    public String home()
    {
        // return "<link href=\"css/App.css\" rel=\"stylesheet\"><div class=\"App-container\"><img class=\"App-logo\" src=\"assets/logo.png\" alt=\"Logo\"><h1>Hola Mundo!</h1><h3>Java Spring Boot</h3></div>";
        return "home";
    }

}  