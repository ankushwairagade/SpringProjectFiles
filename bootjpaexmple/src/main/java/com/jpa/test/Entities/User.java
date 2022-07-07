package com.jpa.test.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Id;

private String name;

private String city;

private String phone;

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public User(int id, String name, String city, String phone) {
	super();
	Id = id;
	this.name = name;
	this.city = city;
	this.phone = phone;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "User [Id=" + Id + ", name=" + name + ", city=" + city + ", phone=" + phone + "]";
}


	
}
