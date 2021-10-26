package com.flght_reservation_1.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEnity{

	private String flightNumber;
	private String opratingAirlone;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDeparureTime;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOpratingAirlone() {
		return opratingAirlone;
	}
	public void setOpratingAirlone(String opratingAirlone) {
		this.opratingAirlone = opratingAirlone;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDeparureTime() {
		return estimatedDeparureTime;
	}
	public void setEstimatedDeparureTime(Timestamp estimatedDeparureTime) {
		this.estimatedDeparureTime = estimatedDeparureTime;
	}
	
	
}
