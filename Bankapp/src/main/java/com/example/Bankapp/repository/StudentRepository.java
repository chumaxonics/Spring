package com.example.Bankapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long>  {

}
