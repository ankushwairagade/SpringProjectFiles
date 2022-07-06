package com.ankush.springcore;

public class Student {

	private int studentID;
	private String studentName;
	private String studetnAddres;
	
	
	public Student() {
		super();
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudetnAddres() {
		return studetnAddres;
	}
	public void setStudetnAddres(String studetnAddres) {
		this.studetnAddres = studetnAddres;
	}
	public Student(int studentID, String studentName, String studetnAddres) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studetnAddres = studetnAddres;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studetnAddres=" + studetnAddres
				+ "]";
	}
	
	
	
	
}
