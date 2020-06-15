package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Person;
import com.projectx.projectx.repository.Personrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class PersonRestController {

    @Autowired
    private Personrepository pr;


    @GetMapping ("/person")
    public List<Person> getallpersons (){
        return pr.findAll();
    }



    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getPerson(@PathVariable("id") long id) {
        return "person = " + pr.findPersons(id).getName();
    }

    @GetMapping ("/persondate/{date}")
    public List<String> getPersonsByDate(@PathVariable String date){

        return pr.getPersonNameByDate(Date.valueOf(date));
    }

}
