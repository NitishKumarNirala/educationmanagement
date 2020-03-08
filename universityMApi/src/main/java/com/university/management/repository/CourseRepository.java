package com.university.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.management.domain.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
