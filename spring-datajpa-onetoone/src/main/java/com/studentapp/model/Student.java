package com.studentapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
	public Student(String name, String department, Address address) {
		super();
		this.name = name;
		this.department = department;
		this.address = address;
	}
	com.hotelapp
	private Address address;

public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

@Override
public String toString() {
	return "Student [name=" + name + ", studentId=" + studentId + ", department=" + department + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}



}
