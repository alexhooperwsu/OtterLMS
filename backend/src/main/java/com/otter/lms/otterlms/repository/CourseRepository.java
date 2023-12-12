package com.otter.lms.otterlms.repository;

import com.otter.lms.otterlms.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA Repository for the course resource
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
