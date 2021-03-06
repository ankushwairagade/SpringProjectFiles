package com.example.SpringREST.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringREST.dao.CourseDao;
import com.example.SpringREST.entities.Course;

@Service
public class CourseServiceImplementation implements CourseService {
	
	// database integration
	
	@Autowired
	private CourseDao courseDao;
	
//	 List<Course> list;
	
	

	public CourseServiceImplementation() {

//		list = new ArrayList<Course>();
//		list.add(new Course(123,"java"," learn core java"));
//		list.add(new Course(112,"C++"," learn core c++"));
//		list.add(new Course(123,"python"," learn core python"));
//		list.add(new Course(123,"Spring"," learn core Spring"));
		

			
		
		
	}



	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
		
//		return list;
	}



	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null;
//		
//		for(Course co : list)
//		{
//			if(co.getId()==courseId)
//			{
//				c=co; break;
//			}
//		}
//		
//		return c;
		
		Course entity =courseDao.getById(courseId);
		return courseDao.getReferenceById(courseId);
		
		//return entity;
		
	}



	@Override
	public Course addCourse(Course course) {
//		
//		list.add(course);		
//		return course;
		
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course)
	{
		courseDao.save(course);
		return course;
	}



	@Override
	public String getDelete(long courseId) {
//		
//		Course r=null;
//		for(Course c : list)
//		{	
//			if(c.getId() == courseId)
//			{
//				r=c; break;
//			}
//		}
//
//		list.remove(r);
//		if(r!=null)
//		return "Object remove";
//		else return "Id not matched";
		
			
		Course entity =courseDao.getOne(courseId);
		courseDao.delete(entity);
		return "delete  successfully";
	}



	

}
