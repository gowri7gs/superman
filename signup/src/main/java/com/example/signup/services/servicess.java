package com.example.signup.services;
import java.util.List;

import com.example.signup.entity.entiti;
public interface servicess {
	public List<entiti> getCourses();
	public entiti getCourse(long courseId);
	public entiti addcourse(entiti course);
	public entiti updatec(entiti course);
	public void deletec(long parseLong);
}
