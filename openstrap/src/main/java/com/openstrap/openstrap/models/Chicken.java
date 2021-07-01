package com.openstrap.openstrap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chicken")
public class Chicken {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer id;
@Column(nullable = false,unique = false,length = 120)
private String username;
@Column(nullable = false,unique = false,length = 130)
private String address;
@Column(nullable = false,unique = false,length = 150)
private String birthdaytime;
@Column(nullable = false,unique = false,length = 140)
private String quantity;
@Column(nullable = false,unique = false,length = 150)
private String email;
@Column(nullable = false,unique = false,length = 150)
private String rate;
@Column(nullable = false,unique = false,length = 100)
private String myfile;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getBirthdaytime() {
	return birthdaytime;
}
public void setBirthdaytime(String birthdaytime) {
	this.birthdaytime = birthdaytime;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRate() {
	return rate;
}
public void setRate(String rate) {
	this.rate = rate;
}
public String getMyfile() {
	return myfile;
}
public void setMyfile(String myfile) {
	this.myfile = myfile;
}


}
