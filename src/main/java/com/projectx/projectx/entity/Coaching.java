package com.projectx.projectx.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
public class Coaching {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoaching;

    @NotNull
    private Date coachingDate;

    @NotNull
    private String onsite;

    @ManyToOne
    @JsonBackReference
    private Coach coach;

    @ManyToOne
    @JsonBackReference
    private Customer customer;

    @ManyToMany
    @JsonManagedReference
    //@JoinTable(name = "coaching_discipline", joinColumns = @JoinColumn(name = "id_coaching"), inverseJoinColumns = @JoinColumn(name = "id_discipline"))
    private List<Discipline> disciplines;

    public Coaching() {
    }

    public Coaching(Long idCoaching, Date coachingDate, String onsite, Coach coach, Customer customer, List<Discipline> disciplines) {
        this.idCoaching = idCoaching;
        this.coachingDate = coachingDate;
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

    public Date getCoachingDate() {
        return coachingDate;
    }

    public void setCoachingDate(Date coachingDate) {
        this.coachingDate = coachingDate;
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
