package com.openstrap.openstrap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="panner")
public class Panner {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(nullable = false,unique = false,length = 140)
private String username;
@Column(nullable = false,unique = false,length = 150)
private String password;
@Column(nullable = false,unique = false,length = 160)
private String email;
@Column(nullable = false,unique = false,length = 200)
private long phone;
@Column(nullable = false,unique = false,length = 100)
private String address;
@Column(nullable = false,unique = false,length=100)
private double salary;
@Column(nullable = false,unique = false,length = 200)
private double rent;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getRent() {
	return rent;
}
public void setRent(double rent) {
	this.rent = rent;
}


}
