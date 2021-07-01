package com.openstrap.openstrap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="transport")
public class Transport {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String Source;
private String Destination;
private String BusNumber;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getSource() {
	return Source;
}
public void setSource(String source) {
	Source = source;
}
public String getDestination() {
	return Destination;
}
public void setDestination(String destination) {
	Destination = destination;
}
public String getBusNumber() {
	return BusNumber;
}
public void setBusNumber(String busNumber) {
	BusNumber = busNumber;
}

}
