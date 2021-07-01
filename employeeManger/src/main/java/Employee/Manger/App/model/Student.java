package Employee.Manger.App.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@Column(nullable = false,updatable = false)
private String name;
private String studentCode;
public String getStudentCode() {
	return studentCode;
}
public void setStudentCode(String studentCode) {
	this.studentCode = studentCode;
}
@Column(nullable = false,updatable = false)
private String email;
@Column(nullable = false,updatable = false)
private String phone;
@Column(nullable = false,updatable = false)
@DateTimeFormat(pattern = "yyyy-MM-dd")	
private Date dob;
@Column(nullable = false,updatable = false)
private String rollno;
@Column(nullable = false,updatable = false)
private String address;
@Column(nullable = false,updatable = false)
@DateTimeFormat(pattern = "yyyy-MM-dd")	
private Date joindate;


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getJoindate() {
	return joindate;
}
public void setJoindate(Date joindate) {
	this.joindate = joindate;
}
public Student(long id, String name, String email, String phone, Date dob, String rollno, String address,
	Date joindate,String studentCode) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.dob = dob;
	this.rollno = rollno;
	this.address = address;
	this.joindate = joindate;
	this.studentCode=studentCode;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob
			+ ", rollno=" + rollno + ", address=" + address + ", joindate=" + joindate + ",studentCode="+studentCode+"]";
}
public Student() {
	
}
}
