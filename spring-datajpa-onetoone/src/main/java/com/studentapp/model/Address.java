package com.studentapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Address {
	@Id
	@GeneratedValue(generator="stud_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="stud_gen",sequenceName="student_seq",initialValue = 1,allocationSize=1)
	private Integer addressId;
	@Column(length=20)
	private String city;
	@Column(length=20)
	private String state;
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + "]";
	}
}
