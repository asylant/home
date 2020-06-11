package com.projectx.projectx.repository;

import com.projectx.projectx.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Personrepository extends JpaRepository<Person, Long>{

    //@Query("JPQL Statement")
    //public (Rückgabewert) Name von Statement ();
    
}
