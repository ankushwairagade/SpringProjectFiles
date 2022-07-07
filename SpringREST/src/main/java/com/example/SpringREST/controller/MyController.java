package com.example.SpringREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringREST.entities.Course;
import com.example.SpringREST.service.CourseService;



@RestController
public class MyController {

	@Autowired
	private CourseService courseservice;
	
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	

	
	//get all the courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return  this.courseservice.getCourses();
	}
	
	
	// get the course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
	
	// add data into List
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseservice.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		 this.courseservice.updateCourse(course);
		 return course;
	}

	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable String courseId)
	{
		return this.courseservice.getDelete(Long.parseLong(courseId));
	}
}
