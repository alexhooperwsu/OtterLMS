package com.otter.lms.otterlms.domain;

/**
 * Represents course levels
 */
public enum CourseLevel {
    GRADUATE("Graduate"), UNDERGRADUATE("Undergraduate");

    private String name;

    private CourseLevel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
