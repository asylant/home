package com.projectx.projectx.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeRestController {

    @RequestMapping(value="/penis", method= RequestMethod.GET)
    public String Penis(){
        System.out.println("Hello");
        return "Penis";
    }

    @RequestMapping("")
    public String Homepage(){
        return "home";
    }
}
