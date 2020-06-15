package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Coaching;
import com.projectx.projectx.entity.Customer;
import com.projectx.projectx.entity.Discipline;
import com.projectx.projectx.repository.Coachingrepository;
import com.projectx.projectx.repository.Customerrepository;
import com.projectx.projectx.repository.Disciplinerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/*@RestController
public class DisciplineRestController {

        @Autowired
        private Disciplinerepository pr;

        @GetMapping("/discipline")
        public List<Discipline> getalldiscipline (){ return pr.findAll();
        }*/


@RestController
@RequestMapping("/discipline")
public class DisciplineRestController {

        @Autowired
        private Disciplinerepository pr;

        @GetMapping("")
        public List<Discipline> returnAllDiscipline(){
                return pr.findAll();
        }

        @GetMapping("/{id}")
        public Optional<Discipline> returnDisciplineById(@PathVariable long id){
                return pr.findById(id);
        }
}
