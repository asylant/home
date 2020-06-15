package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Coaching;
import com.projectx.projectx.repository.Coachingrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coaching")
public class CoachingRestController {

 @Autowired
    private Coachingrepository or;

 @GetMapping("")
    public List<Coaching> returnAllCoachings(){
     return or.findAll();
 }

    @GetMapping("/{id}")
    public Optional<Coaching> returnCoachingById(@PathVariable long id){
        return or.findById(id);
    }

}
