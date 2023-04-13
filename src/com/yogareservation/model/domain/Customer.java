package com.yogareservation.model.domain;

import java.util.Objects;

public class Customer {
	
	//variables
		private String firstName;
		private String lastName;
		private String email;
		private String phoneNumber;
		private String address;
		private String password;
		
		//default constructor
		public Customer() {	
		}
		
		
		//overloaded constructor
		public Customer(String firstName, String lastName, String email, String phoneNumber, String address,
				String password) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.password = password;
		}
		
		//getters and setters
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		//hash
		@Override
		public int hashCode() {
			return Objects.hash(address, email, firstName, lastName, password, phoneNumber);
		}
		
		//equals
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			return Objects.equals(address, other.address) && Objects.equals(email, other.email)
					&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
					&& Objects.equals(password, other.password) && Objects.equals(phoneNumber, other.phoneNumber);
		}
		
		//toString
		@Override
		public String toString() {
			return "AvailableClasses [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", password=" + password + "]";
		}
		
		

}
