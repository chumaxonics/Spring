package com.example.Bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bankapp.domain.Student;

@Repository
public interface StudentRepository  extends  JpaRepository<Student, Long>  {

}
