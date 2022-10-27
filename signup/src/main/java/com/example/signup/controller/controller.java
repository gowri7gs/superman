package com.example.signup.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.signup.services.servicess;
import com.example.signup.entity.entiti;
@RestController
public class controller {
	@Autowired
	private servicess cserive;
	@GetMapping("/home")
public String home() {
	return "hello makkale";
}
	//get the courses
	@GetMapping("/courses")
	public List<entiti> getCourses()
	{
		return this.cserive.getCourses();
		
	}
	@GetMapping("/courses/{courseId}")
	public entiti getCourses(@PathVariable String courseId) {
		return this.cserive.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public entiti addcourse(@RequestBody entiti course) {
		return this.cserive.addcourse(course);
	}
	@PutMapping("/courses")
	public entiti updatec(@RequestBody entiti course) {
		return this.cserive.updatec(course);
	}
	@DeleteMapping("courses/{courseId}")
		public ResponseEntity<HttpStatus> deletec(@PathVariable String courseId){
			try {
				this.cserive.deletec(Long.parseLong(courseId));
				return new ResponseEntity<>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
