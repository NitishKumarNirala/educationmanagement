package com.university.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.management.domain.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
