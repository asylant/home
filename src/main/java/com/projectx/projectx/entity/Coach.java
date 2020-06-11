package com.projectx.projectx.entity;

import javax.persistence.Entity;

@Entity
public class Coach extends Person {

    private String location;

    public Coach(String name, String phone, String location) {
        super(name, phone);
        this.location = location;
    }

    public Coach() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
