package com.university.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.management.domain.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

}
