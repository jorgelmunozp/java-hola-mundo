package com.holamundo.javaholamundo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Router
{
    @RequestMapping("/")
    public String index()
    {
        return "<div style=\"font-family:Arial; font-size:2em; color:#282c34; background-color:#ccc; padding:100px 0 100px 0\"><center><img src=\"assets/logo.png\" alt=\"Logo\" width=\"150\" height=\"180\"><h1>Hola Mundo!</h1><h2>Java Spring Boot</h2></center></div>";
    }

}  