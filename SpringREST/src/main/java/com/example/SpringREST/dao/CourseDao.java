package com.example.SpringREST.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringREST.entities.Course;

public interface CourseDao extends JpaRepository<Course ,Long>{

	
	
}
