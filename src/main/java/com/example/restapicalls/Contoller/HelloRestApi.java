package com.example.restapicalls.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestApi {

    @RequestMapping(value= {"","/","/home"})
    public String Print()
    {
        return "Hello From Bridgelabz";
    }
}
