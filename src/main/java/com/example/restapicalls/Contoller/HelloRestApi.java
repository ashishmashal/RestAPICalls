package com.example.restapicalls.Contoller;

import com.example.restapicalls.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/hello")
public class HelloRestApi {

    @RequestMapping(value= {"","/","/home"})
    public String PrintSimple()
    {
        return "Hello From Bridgelabz";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloParam(@RequestParam(value = "name") String name)
    {
        return "Hello " + name + "!";
    }

    @RequestMapping("/query/{name}")
    public String PrintPath(@PathVariable String name)
    {
        return "Hello " + name + "!";
    }
    @PostMapping("/hello")
    public String sayHello(@RequestBody User user)
    {
        return "Hello " + user.getFirstName() + " "+  user.getLastName() + "!";
    }
}
