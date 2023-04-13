package com.yogareservation.model.domain;

import java.util.Objects;

public class Reservation {
	
	//variables
	private Customer customer;
	private YogaClass yogaClass;
	private String reservationId;
	private String timeCreated;
	private String timeUpdated;
	
	//constructor
	public Reservation() {
		
	}

	public Reservation(Customer customer, YogaClass yogaClass, String reservationId, String timeCreated) {
		super();
		this.customer = customer;
		this.yogaClass = yogaClass;
		this.reservationId = reservationId;
		this.timeCreated = timeCreated;
	}
	
	//constructors for if admin wants to view reservation by customer, class, reservationId, or timeCreated & timeUpdated	
	public Reservation(Customer customer) {
		super();
		this.customer = customer;
	}

	public Reservation(YogaClass yogaClass) {
		super();
		this.yogaClass = yogaClass;
	}
	
	public Reservation(String reservationId) {
		super();
		this.reservationId = reservationId;
	}
	
	public Reservation(String timeCreated, String timeUpdated) {
		super();
		this.timeCreated = timeCreated;
		this.timeUpdated = timeUpdated;
	}

	//getters and setters

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public YogaClass getYogaClass() {
		return yogaClass;
	}

	public void setYogaClass(YogaClass yogaClass) {
		this.yogaClass = yogaClass;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(String timeCreated) {
		this.timeCreated = timeCreated;
	}

	public String getTimeUpdated() {
		return timeUpdated;
	}

	public void setTimeUpdated(String timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	//hash and equals
	@Override
	public int hashCode() {
		return Objects.hash(customer, reservationId, timeCreated, timeUpdated, yogaClass);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(reservationId, other.reservationId)
				&& Objects.equals(timeCreated, other.timeCreated) && Objects.equals(timeUpdated, other.timeUpdated)
				&& Objects.equals(yogaClass, other.yogaClass);
	}

	//toString
	@Override
	public String toString() {
		return "Reservation [customer=" + customer + ", yogaClass=" + yogaClass + ", reservationId=" + reservationId
				+ ", timeCreated=" + timeCreated + ", timeUpdated=" + timeUpdated + "]";
	}
	
	
	


}
