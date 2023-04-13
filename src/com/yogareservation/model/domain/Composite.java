package com.yogareservation.model.domain;

//composite object that holds Customer, Reservation, and YogaClass
public class Composite {

	private Customer customer;
	private Reservation reservation;
	private YogaClass yogaClass;
	
	//constructor 
	public Composite() {
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public YogaClass getYogaClass() {
		return yogaClass;
	}

	public void setYogaClass(YogaClass yogaClass) {
		this.yogaClass = yogaClass;
	}
	
	

}
