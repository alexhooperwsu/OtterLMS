package com.otter.lms.otterlms.utils;

import com.otter.lms.otterlms.domain.CourseLevel;
import com.otter.lms.otterlms.dto.CourseDTO;
import com.otter.lms.otterlms.entity.Course;

public class TestEntityFactory {
    public static CourseDTO validCourseDTO() {
        return CourseDTO.builder()
            .type("CS")
            .code("1000")
            .name("Technology and Society")
            .level(CourseLevel.UNDERGRADUATE)
            .creditHours(3)
            .build();
    }

    public static Course validCourse() {
        return new Course(1L, "CS", "1000", "Technology and Society", CourseLevel.UNDERGRADUATE, 3);
    }
}
