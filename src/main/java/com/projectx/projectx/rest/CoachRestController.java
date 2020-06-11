package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Coach;
import com.projectx.projectx.repository.Coachrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoachRestController {
    @Autowired
    private Coachrepository pr;

    @GetMapping("/coach")
    public List<Coach> getallcoaches (){
        return pr.findAll();
    }

}