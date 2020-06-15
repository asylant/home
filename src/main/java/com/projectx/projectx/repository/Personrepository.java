package com.projectx.projectx.repository;

import com.projectx.projectx.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface Personrepository extends JpaRepository<Person, Long>{


    @Query("SELECT p.name FROM Person p, Coach c, Coaching co WHERE p.idPerson = c.idPerson AND c.idPerson = co.coach AND co.coachingdate = ?1")
    List<String> getPersonNameByDate(Date date);

    @Query(
    value = "SELECT * FROM person WHERE id_person = 1",
    nativeQuery = true)
    Person findPerson(
            @Param("id") Long id);

    @Query("SELECT u FROM Person u WHERE u.idPerson = :idPerson")
    Person findPersons(
            @Param("idPerson") Long idPerson
    );

}
