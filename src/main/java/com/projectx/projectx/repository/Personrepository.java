package com.projectx.projectx.repository;

import com.projectx.projectx.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface Personrepository extends JpaRepository<Person, Long>{

    @Query("SELECT p.name FROM Person p, Coach c, Coaching co WHERE p.idPerson = c.idPerson AND c.idPerson = co.idCoaching AND co.coachingDate = ?1")
    List<String> getPersonNameByDate(Date date);

   /* @Query(
            SELECT super.name
                FROM supertype super, ptype p, subject s
                    WHERE super.id = p.id
                        AND s.prv = p.id
                            AND s.asterisk = X*/

    @Query("SELECT u FROM Person u WHERE u.idPerson = :idPerson")
    Person findPersons(
            @Param("idPerson") Long idPerson
    );

}
