package com.learn.CheckSpring.Service;

import com.learn.CheckSpring.Entity.Course;

import java.util.List;

public interface CourseServicable {

    public List<Course> getCourseList();
    public  Course getCourseById (int id);
    public Course addCourse(Course course);
    public void deleteCourse(int id);
    public Course updateCourse(int id, Course course);
}
