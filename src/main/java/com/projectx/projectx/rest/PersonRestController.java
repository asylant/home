package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Person;
import com.projectx.projectx.repository.Personrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonRestController {
    @Autowired
    private Personrepository pr;


    @GetMapping ("/personen")
    public List<Person> getallpersonen (){
        return pr.findAll();
    }

}
