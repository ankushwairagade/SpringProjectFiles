package com.ankush.spring.Collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String , String> fees;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, String> getFees() {
		return fees;
	}

	public void setFees(Map<String, String> fees) {
		this.fees = fees;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", \n fees=" + fees + ", \nproperties=" + properties + "]";
	}


	


	
	
}
