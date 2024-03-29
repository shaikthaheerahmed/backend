package Employee.Manger.App.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Employee implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false,updatable = false)
private long id;
private String name;
private String jobTitle;
private String phone;
private String email;
private String imageUrl;
@Column(nullable = false,updatable = false)
private String employeeCode;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", jobTitle=" + jobTitle + ", phone=" + phone + ", imageUrl="
			+ imageUrl + ", employeeCode=" + employeeCode + ",email=" +email+ "]";
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

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
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}
public String getEmployeeCode() {
	return employeeCode;
}
public void setEmployeeCode(String employeeCode) {
	this.employeeCode = employeeCode;
}
public Employee(long id, String name, String jobTitle, String phone, String imageUrl, String employeeCode,String email) {
	super();
	this.id = id;
	this.name = name;
	this.jobTitle = jobTitle;
	this.phone = phone;
	this.imageUrl = imageUrl;
	this.employeeCode = employeeCode;
	this.email=email;
}
public Employee() {
	
}

}
