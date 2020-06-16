package com.projectx.projectx.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Coach extends Person {

    private String location;

    @OneToMany
    @JsonManagedReference
    private List<Coaching> coachings;

    public Coach() {
    }

    public Coach(String name, String phone) {
    super(name, phone);
    }

    public Coach(String name, String phone, String location, List<Coaching> coachings) {
        super(name, phone);
        this.location = location;
        this.coachings = coachings;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Coaching> getCoachings() {
        return coachings;
    }

    public void setCoachings(List<Coaching> coachings) {
        this.coachings = coachings;
    }
}
