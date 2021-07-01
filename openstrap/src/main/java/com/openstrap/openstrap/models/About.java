package com.openstrap.openstrap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="about")
public class About {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(nullable = false,unique = false, length = 120)
private String username;
@Column(nullable = false,unique = false,length=100)
private String password;
@Column(nullable = false,unique = false,length=100)
private String firstname;
@Column(nullable = false,unique = false,length = 56)
private String lastname;
@Column(nullable = false,unique = false,length = 100)
private String email;
@Column(nullable = false,unique = false,length=60)
private String fileImage;
@Column(nullable = false,unique = false,length = 100)
private String datemax;

private String datemin;
public String getDatemin() {
	return datemin;
}
public void setDatemin(String datemin) {
	this.datemin = datemin;
}
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
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getFileImage() {
	return fileImage;
}
public void setFileImage(String fileImage) {
	this.fileImage = fileImage;
}
public String getDatemax() {
	return datemax;
}
public void setDatemax(String datemax) {
	this.datemax = datemax;
}


}
