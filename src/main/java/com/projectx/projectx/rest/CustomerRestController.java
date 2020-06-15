package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Customer;

import com.projectx.projectx.repository.Customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
    @Autowired
    private Customerrepository pr;

    @GetMapping("/customer")
    public List<Customer> getallcustomer (){
        return pr.findAll();
    }

}


