package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departmentrepository  extends JpaRepository<Department, Long> {
}

