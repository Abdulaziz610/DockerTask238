package com.DockerContainer.DockerContainer.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomeController {

    @GetMapping
    public String welcomeHomePage(){
        return "Hello Word!!!!";
    }
}
