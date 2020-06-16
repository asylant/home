package com.projectx.projectx.repository;

import com.projectx.projectx.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Coachrepository extends JpaRepository<Coach, Long> {

}

