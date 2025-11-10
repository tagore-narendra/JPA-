package com.example.demoJPA.repository;

import com.example.demoJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
