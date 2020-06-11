package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Coaching;
import com.projectx.projectx.repository.Coachingrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoachingRestController {

 @Autowired
    private Coachingrepository pr;

 @GetMapping("/coaching")
    public List<Coaching> returnAllCoachings(){
     return pr.findAll();
 }
}
