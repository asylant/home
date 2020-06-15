package com.projectx.projectx.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeRestController {

    @RequestMapping("")
    public String returnHomepage(){
        return "home";
    }
}
