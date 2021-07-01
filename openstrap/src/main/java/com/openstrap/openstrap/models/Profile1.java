package com.openstrap.openstrap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile1")
public class Profile1 {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer id;
@Column(nullable = false,length = 150,unique = false)
private String Name;
@Column(nullable = false,length = 150,unique = false)
private String NumberofSeats;
@Column(nullable = false,length = 100,unique = false)
private String Seats;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getNumberofSeats() {
	return NumberofSeats;
}
public void setNumberofSeats(String numberofSeats) {
	NumberofSeats = numberofSeats;
}
public String getSeats() {
	return Seats;
}
public void setSeats(String seats) {
	Seats = seats;
}


}
