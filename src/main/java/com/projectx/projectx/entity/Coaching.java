package com.projectx.projectx.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
public class Coaching {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoaching;

    @NotNull
    private Date coachingdate;

    @NotNull
    private String onsite;

    @ManyToOne
    private Coach coach;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    @JoinTable(name = "coaching_discipline", joinColumns = @JoinColumn(name = "id_coaching"), inverseJoinColumns = @JoinColumn(name = "id_discipline"))
    private List<Discipline> disciplines;

    public Coaching() {
    }

    public Coaching(Long idCoaching, Date coachingdate, String onsite, Coach coach, Customer customer, List<Discipline> disciplines) {
        this.idCoaching = idCoaching;
        this.coachingdate = coachingdate;
        this.onsite = onsite;
        this.coach = coach;
        this.customer = customer;
        this.disciplines = disciplines;
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

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
}
