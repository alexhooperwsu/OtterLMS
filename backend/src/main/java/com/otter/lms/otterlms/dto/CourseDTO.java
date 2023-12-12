package com.otter.lms.otterlms.dto;

import com.otter.lms.otterlms.domain.CourseLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * External (public) representation of a course
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    private Long id;
    private String type;
    private String code;
    private String name;
    private CourseLevel level;
    private int creditHours;
}

