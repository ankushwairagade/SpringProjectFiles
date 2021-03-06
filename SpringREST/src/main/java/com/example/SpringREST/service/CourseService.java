package com.example.SpringREST.service;

import java.util.List;

import com.example.SpringREST.entities.Course;

public interface CourseService {

	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public String getDelete(long courseId);
	
	public Course updateCourse(Course course);
}
