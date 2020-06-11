package com.projectx.projectx.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiscipline;

    private String disciplinename;

    @ManyToMany
    private List<Coaching> coachings;

    public Discipline() {
    }

    public Discipline(Long idDiscipline, String disciplinename, List<Coaching> coachings) {
        this.idDiscipline = idDiscipline;
        this.disciplinename = disciplinename;
        this.coachings = coachings;
    }

    public Long getIdDiscipline() {
        return idDiscipline;
    }

    public void setIdDiscipline(Long idDiscipline) {
        this.idDiscipline = idDiscipline;
    }

    public String getDisciplinename() {
        return disciplinename;
    }

    public void setDisciplinename(String disciplinename) {
        this.disciplinename = disciplinename;
    }

    public List<Coaching> getCoachings() {
        return coachings;
    }

    public void setCoachings(List<Coaching> coachings) {
        this.coachings = coachings;
    }
}
