package com.projectx.projectx.rest;

import com.projectx.projectx.entity.Discipline;
import com.projectx.projectx.repository.Disciplinerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisciplineRestController {

        @Autowired
        private Disciplinerepository pr;

        @GetMapping("/discipline")
        public List<Discipline> getalldiscipline (){ return pr.findAll();
        }
}
