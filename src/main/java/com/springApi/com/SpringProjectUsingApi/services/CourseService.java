package com.springApi.com.SpringProjectUsingApi.services;

import java.util.List;

import com.springApi.com.SpringProjectUsingApi.entities.Course;

public interface CourseService {

	public  List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

	public Course updateCourse(Course course);
}
