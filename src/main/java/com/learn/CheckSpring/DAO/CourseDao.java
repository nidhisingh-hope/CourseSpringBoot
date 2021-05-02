package com.learn.CheckSpring.DAO;

import com.learn.CheckSpring.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Integer> {
}
