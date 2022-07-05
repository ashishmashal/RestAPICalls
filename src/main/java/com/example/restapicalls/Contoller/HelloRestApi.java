package com.example.restapicalls.Contoller;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/hello")
public class HelloRestApi {

    @RequestMapping(value= {"","/","/home"})
    public String Print()
    {
        return "Hello From Bridgelabz";
    }

    @RequestMapping(value = {"/query/{name}"}, method = RequestMethod.GET)
    public String Print(@PathVariable String name)
    {
        return "Hello " + name + "!";
    }
}
