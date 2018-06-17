package edu.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.domain.Student;

@Repository
public interface StudentRepository  extends  CrudRepository<Student, Long>  {}