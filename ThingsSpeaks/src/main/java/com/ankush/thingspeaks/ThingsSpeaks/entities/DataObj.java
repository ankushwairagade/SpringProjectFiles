package com.ankush.thingspeaks.ThingsSpeaks.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DataObj {

	@Column
    @ElementCollection(targetClass=Integer.class)
	private List<Integer> field1;
	@Column
    @ElementCollection(targetClass=Integer.class)
	private List<Integer> field2;
	@Id
	private int Uid;
	public List<Integer> getField1() {
		return field1;
	}
	public void setField1(List<Integer> field1) {
		this.field1 = field1;
	}
	public List<Integer> getField2() {
		return field2;
	}
	public void setField2(List<Integer> field2) {
		this.field2 = field2;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public DataObj(List<Integer> field1, List<Integer> field2, int uid) {
		
		this.field1 = field1;
		this.field2 = field2;
		Uid = uid;
	}
	public DataObj() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DataObj [field1=" + field1 + ", field2=" + field2 + ", Uid=" + Uid + "]";
	}
	
	

	
	
	
}
