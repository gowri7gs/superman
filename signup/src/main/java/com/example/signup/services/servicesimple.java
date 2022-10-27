package com.example.signup.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.signup.Dao.Dao;
import com.example.signup.entity.entiti;

@Service
public class servicesimple implements servicess {
	@Autowired
	private Dao Daoo;
//	List<Course> list;
	public servicesimple() {
//		list=new ArrayList<>();
//		list.add(new Course(145,"java","courses are great"));
//		list.add(new Course(146,"python","courses are great"));
//		list.add(new Course(147,"c++","courses are great"));
	}
	@Override
	public List<entiti> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return Daoo.findAll();
	}
	@Override
	public entiti getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course course : list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		return Daoo.getOne(courseId);
	}
	@Override
	public entiti addcourse(entiti course) {
		// TODO Auto-generated method stub
//		list.add(course);
		Daoo.save(course);
		return course;
	}
	@Override
	public entiti updatec(entiti course) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
	       Daoo.save(course);
		return course;
	}
	@Override
	public void deletec(long parseLong) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	entiti entity=Daoo.getOne(parseLong);
	Daoo.delete(entity);
	}
}
