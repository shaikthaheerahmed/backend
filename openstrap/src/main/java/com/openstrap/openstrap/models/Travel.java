package com.openstrap.openstrap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="travel")
public class Travel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(nullable = false,unique = false,length = 60)
private String firstname;
@Column(nullable = false,unique = false,length = 160)
private String lastname;
@Column(nullable = false,unique = false,length = 160)
private String middlename;
@Column(nullable = false,unique = false,length = 160)
private String address;
@Column(nullable = false,unique = false,length = 160)
private String source;
@Column(nullable = false,unique = false,length = 160)
private String destination;
@Column(nullable = false,unique = false,length = 160)
private String email;

private String fileImage;

public String getFileImage() {
	return fileImage;
}
public void setFileImage(String fileImage) {
	this.fileImage = fileImage;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
public String getMiddlename() {
	return middlename;
}
public void setMiddlename(String middlename) {
	this.middlename = middlename;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}

}
