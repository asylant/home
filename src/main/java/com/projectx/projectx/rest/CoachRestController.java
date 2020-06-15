package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Coach;
import com.projectx.projectx.repository.Coachrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/coach")
public class CoachRestController {

    @Autowired
    private Coachrepository pr;

    @GetMapping("")
    public List<Coach> getallcoaches() {
        return pr.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Coach> returnCoachById(@PathVariable long id) {
        return pr.findById(id);

    }
}