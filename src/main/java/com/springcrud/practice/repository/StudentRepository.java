package com.springcrud.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcrud.practice.entity.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
