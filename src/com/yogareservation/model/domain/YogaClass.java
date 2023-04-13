package com.yogareservation.model.domain;

import java.util.Objects;

public class YogaClass {
	//variables
	private float cost;
	private int temperature;
	private String instructor;
	private String category;
	private int maxNumberParticipants;
	private String year;
	private String month;
	private String day;
	private String time;
	private String duration;
	
	
	//default constructor
	
	public YogaClass() {
		
	}
	
	//overloaded constructor
	public YogaClass(float cost, int temperature, String instructor, String category, int maxNumberParticipants,
			String year, String month, String day, String time, String duration, boolean isAvailable) {
		super();
		this.cost = cost;
		this.temperature = temperature;
		this.instructor = instructor;
		this.category = category;
		this.maxNumberParticipants = maxNumberParticipants;
		this.year = year;
		this.month = month;
		this.day = day;
		this.time = time;
		this.duration = duration;
	}
	
	
	//getters and setters
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getMaxNumberParticipants() {
		return maxNumberParticipants;
	}
	public void setMaxNumberParticipants(int maxNumberParticipants) {
		this.maxNumberParticipants = maxNumberParticipants;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	//hashcode and equals 
	@Override
	public int hashCode() {
		return Objects.hash(category, cost, day, duration, instructor, maxNumberParticipants, month, temperature, time,
				year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		YogaClass other = (YogaClass) obj;
		return Objects.equals(category, other.category)
				&& Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost) && Objects.equals(day, other.day)
				&& Objects.equals(duration, other.duration) && Objects.equals(instructor, other.instructor)
				&& maxNumberParticipants == other.maxNumberParticipants && Objects.equals(month, other.month)
				&& temperature == other.temperature && Objects.equals(time, other.time)
				&& Objects.equals(year, other.year);
	}
	
	//toString
	@Override
	public String toString() {
		return "Class [cost=" + cost + ", temperature=" + temperature + ", instructor=" + instructor + ", category="
				+ category + ", maxNumberParticipants=" + maxNumberParticipants + ", year=" + year + ", month=" + month
				+ ", day=" + day + ", time=" + time + ", duration=" + duration + "]";
	}
	
	

}
