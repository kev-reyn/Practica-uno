package com.practicaRest.repository;

import com.practicaRest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
