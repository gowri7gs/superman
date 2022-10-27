package com.example.crudappli.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudappli.CourseDao.CourseDao;
import com.example.crudappli.entities.Course;

@Service
public class crudappliServiceimple implements crudappliServices {
	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
	public crudappliServiceimple() {
//		list=new ArrayList<>();
//		list.add(new Course(145,"java","courses are great"));
//		list.add(new Course(146,"python","courses are great"));
//		list.add(new Course(147,"c++","courses are great"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course course : list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		return courseDao.getOne(courseId);
	}
	@Override
	public Course addcourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updatec(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}
	@Override
	public void deletec(long parseLong) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	Course entity=courseDao.getOne(parseLong);
	courseDao.delete(entity);
	}

}
