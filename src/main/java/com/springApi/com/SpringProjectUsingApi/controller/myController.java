package com.springApi.com.SpringProjectUsingApi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springApi.com.SpringProjectUsingApi.entities.Course;
import com.springApi.com.SpringProjectUsingApi.services.CourseServiceImpl;


@RestController
public class myController {
	
	@Autowired
	private CourseServiceImpl CourseService;
	
	@GetMapping("/home")
	public  String home() {
		return "This is hoem page";
	}
	
//	get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.CourseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.CourseService.getCourse(Long.parseLong(courseId));
		
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.CourseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.CourseService.updateCourse(course);
	}
}
