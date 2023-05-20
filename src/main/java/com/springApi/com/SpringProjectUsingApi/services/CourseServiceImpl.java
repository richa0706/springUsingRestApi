package com.springApi.com.SpringProjectUsingApi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.springApi.com.SpringProjectUsingApi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(123, "Spring Boot", "This is my first course"));
		list.add(new Course(111, "CI/CD Pipeline", "This is my second course"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		
		Course c = null;
		
		for(Course course:list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return course;
	}

}
