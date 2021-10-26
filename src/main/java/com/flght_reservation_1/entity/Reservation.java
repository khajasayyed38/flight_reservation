package com.flght_reservation_1.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEnity {
	private boolean chechedIn;
	private int numberOfbags;
	
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private  Flight flight;
	public boolean isChechedIn() {
		return chechedIn;
	}
	public void setChechedIn(boolean chechedIn) {
		this.chechedIn = chechedIn;
	}
	public int getNumberOfbags() {
		return numberOfbags;
	}
	public void setNumberOfbags(int numberOfbags) {
		this.numberOfbags = numberOfbags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
}
