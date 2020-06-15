package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Customer;

import com.projectx.projectx.repository.Customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    private Customerrepository rr;

    @GetMapping("")
    public List<Customer> getallcustomer() {
        return rr.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable long id) {
        return rr.findById(id);
    }

}


