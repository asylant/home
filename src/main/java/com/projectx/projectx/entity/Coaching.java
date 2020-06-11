package com.projectx.projectx.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Coaching {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoaching;

    private Date coachingdate;

    private String onsite;

    @OneToMany
    private List<Coach> coaches;

    @OneToMany
    private List<Customer> customers;

//    @ManyToMany
//    @JsonIgnore
//    private List<Discipline> disciplines;


    public Coaching() {
    }

    public Coaching(Long idCoaching, Date coachingdate, String onsite, List<Coach> coaches, List<Customer> customers) {
        this.idCoaching = idCoaching;
        this.coachingdate = coachingdate;
        this.onsite = onsite;
        this.coaches = coaches;
        this.customers = customers;
    }

    public Long getIdCoaching() {
        return idCoaching;
    }

    public void setIdCoaching(Long idCoaching) {
        this.idCoaching = idCoaching;
    }

    public Date getCoachingdate() {
        return coachingdate;
    }

    public void setCoachingdate(Date coachingdate) {
        this.coachingdate = coachingdate;
    }

    public String getOnsite() {
        return onsite;
    }

    public void setOnsite(String onsite) {
        this.onsite = onsite;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
