package com.ankush.thingspeaks.ThingsSpeaks.controller;

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

import com.ankush.thingspeaks.ThingsSpeaks.dao.DataDao;
import com.ankush.thingspeaks.ThingsSpeaks.entities.DataObj;
import com.ankush.thingspeaks.ThingsSpeaks.service.DataService;





@RestController
public class MyController {
	
	@Autowired
	private DataService dataService;


	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to ThingsSpeaks is home page ";
	}
	
	
	@GetMapping("/fields/{Uid}")
	public DataObj getOneObject(@PathVariable String Uid)
	{
		return this.dataService.getObj(Integer.parseInt(Uid));
		
	}
	
	
	
	// get all data fields
	
	@GetMapping("/fields")
	public List<DataObj> getAllfiled()
	{
		return dataService.getAllObj();
		
		
	}
	
	
	
	
	// add data into List
	@PostMapping("/fields")
	public DataObj addField(@RequestBody DataObj data)
	{
		return this.dataService.addField(data);
		
		
	}
	
	
	@PutMapping("/fields/{Uid}")
	public DataObj updateField(@RequestBody DataObj data)
	{
		return this.dataService.updateField(data);
		
	}
	
	
	@DeleteMapping("/fields/{Uid}")
	public String deleteField(@PathVariable String Uid)
	{
		
		
		
		 this.dataService.getField(Integer.parseInt(Uid)); 
		 		return "Deleted ..";
		  
		 }
		 
		
		
	}
	
	
	
	

