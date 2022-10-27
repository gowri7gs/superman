package com.example.crudappli.CourseDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudappli.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long> {

}
