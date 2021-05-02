package com.learn.CheckSpring.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private int courseId;
    private String courseName;
    private String courseDesc;

    public Course(int courseId, String courseName, String courseDesc) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
    }

    public Course() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
}
