package com.jpa.test.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.Entities.User;

public interface UserService extends CrudRepository<User ,Integer>{

	public User findByName(String name);
	
	// JPQL Query
	
	// Custom Query without parameters
	@Query("select u FROM User u")
	public List<User> getAllData();

	// Custom Query with parameters using ' @Param ' -- annotation  
	@Query("select u FROM User u WHERE u.name =:n")
	public User getUser(@Param("n") String name);
	
		
	// Native Query
	
	@Query(value="select * from user",nativeQuery=true)
	public List<User> getNativeUsers();
}
