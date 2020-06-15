package com.projectx.projectx.entity;

import com.sun.istack.NotNull;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer extends Person {

    @NotNull
    private String address;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Coaching> coachings;

    public Customer() {
    }

    public Customer(String name, String phone) {
        super(name, phone);
    }

    public Customer(String name, String phone, String address, List<Coaching> coachings) {
        super(name, phone);
        this.address = address;
        this.coachings = coachings;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Coaching> getCoachings() {
        return coachings;
    }

    public void setCoachings(List<Coaching> coachings) {
        this.coachings = coachings;
    }
}



