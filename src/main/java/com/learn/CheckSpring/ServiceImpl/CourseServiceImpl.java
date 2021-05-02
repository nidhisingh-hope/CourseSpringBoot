package com.learn.CheckSpring.ServiceImpl;

import com.learn.CheckSpring.Entity.Course;
import com.learn.CheckSpring.DAO.CourseDao;
import com.learn.CheckSpring.Service.CourseServicable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@Repository("courseDao")
public class CourseServiceImpl implements CourseServicable {

    @Autowired
    private CourseDao courseDao;

    //List<Course> courseList = new ArrayList<>();

    public CourseServiceImpl() {
        /*this.courseDao = courseDao;
        courseList.add( new Course(101,"Java Course", "This is Java Course"));
        courseList.add( new Course(102,"ReactJS Course", "This is ReactJS Course"));
*/
    }

    @Override
    public List<Course> getCourseList() {
       /* return courseList;*/
        return courseDao.findAll();
    }

    @Override
    public Course getCourseById(int id) {
      /* Course course1=null;
        for(Course course : courseList) {
            if (course.getCourseId() == id)
                course1 = course;
        }*/
        return courseDao.findById(id).get();

    }

    @Override
    public Course addCourse(Course course) {
        /*courseList.add(course);*/
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(int id) {
       /* for (Course course: courseList){
            if(course.getCourseId()==id)
                   courseList.remove(course);

        }*/
        courseDao.delete(courseDao.getOne(id));

    }

    @Override
    public Course updateCourse(int id, Course course) {
       /* Course course1=null;
        for (Course cour : courseList){
            if(cour.getCourseId()==id)
                course1=courseList.set(courseList.indexOf(cour), course);

        }
        return course1;*/
        courseDao.save(course);
        return course;
    }
}
