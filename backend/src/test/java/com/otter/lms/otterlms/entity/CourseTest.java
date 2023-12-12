package com.otter.lms.otterlms.entity;

import com.otter.lms.otterlms.domain.CourseComplexity;
import com.otter.lms.otterlms.domain.CourseLevel;
import org.junit.jupiter.api.Test;

import static com.otter.lms.otterlms.utils.TestEntityFactory.validCourse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

    private Course course = validCourse();

    @Test
    public void testGraduateComplexity() {
        course.setLevel(CourseLevel.GRADUATE);

        course.setCreditHours(1);
        assertEquals(CourseComplexity.EASY, course.getComplexity());

        course.setCreditHours(2);
        assertEquals(CourseComplexity.MEDIUM, course.getComplexity());

        course.setCreditHours(4);
        assertEquals(CourseComplexity.HARD, course.getComplexity());
    }

    @Test
    public void testUndergraduateComplexity() {
        course.setLevel(CourseLevel.UNDERGRADUATE);

        course.setCreditHours(1);
        assertEquals(CourseComplexity.EASY, course.getComplexity());

        course.setCreditHours(3);
        assertEquals(CourseComplexity.MEDIUM, course.getComplexity());

        course.setCreditHours(5);
        assertEquals(CourseComplexity.HARD, course.getComplexity());
    }
}
