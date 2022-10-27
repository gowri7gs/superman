package com.example.crudappli.Services;

import java.util.List;

import com.example.crudappli.entities.Course;

public interface crudappliServices {
public List<Course> getCourses();
public Course getCourse(long courseId);
public Course addcourse(Course course);
public Course updatec(Course course);
public void deletec(long parseLong);
}
