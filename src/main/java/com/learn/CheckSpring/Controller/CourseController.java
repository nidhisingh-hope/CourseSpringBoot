package com.learn.CheckSpring.Controller;

import com.learn.CheckSpring.Entity.Course;
import com.learn.CheckSpring.Service.CourseServicable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseServicable courseServicable;

    List<Course> courses = new ArrayList<>();
    Course course=null;

    @GetMapping("/home")
    public String home(){
        return "Welcome to Course Application";
    }

    @GetMapping("/course")
    public List<Course> getCourseList()
    {
        courses = courseServicable.getCourseList();
        return courses;
    }

    @GetMapping("/course/{courseID}")
    public Course getCourseID( @PathVariable String courseID) {
        course=courseServicable.getCourseById(Integer.parseInt(courseID));
        return course;
    }

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course){
        courseServicable.addCourse(course);
        return course;
    }

    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            courseServicable.deleteCourse(Integer.parseInt(courseId));
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/course/{courseId}")
        public Course updateCourse(@PathVariable String courseId, @RequestBody Course course){
        return courseServicable.updateCourse(Integer.parseInt(courseId),course);

    }


}
