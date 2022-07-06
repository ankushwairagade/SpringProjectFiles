package com.ankush.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class Student {
	@Value("ankush")
 private String studentName;
	@Value("chandrapur mh")
 private String city;
	
	@Value("#{address}")
private List<String> address;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
}


 
 
}
