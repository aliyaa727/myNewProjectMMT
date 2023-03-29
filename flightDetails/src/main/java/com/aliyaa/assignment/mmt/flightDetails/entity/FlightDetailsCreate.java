package com.aliyaa.assignment.mmt.flightDetails.entity;

import java.sql.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="flight_details")
public class FlightDetailsCreate {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="airlines")
	private String airlines;
	
	@JsonProperty("departureDate")
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name="departing_time")
	private Date departingTime;
	
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name="arrival_time")
	private Date arrivalTime;
	 
	 @JsonFormat(pattern="HH:mm:ss")
		@Column(name="duration")
		private Date duration;
		
	@Column(name="fare")
	private float fare;
	
	public FlightDetailsCreate(int id, String airlines, Date departingTime, Date arrivalTime, Date duration, float fare,
			String source, String destination, String departingShift, String seatType) {
		super();
		this.id = id;
		this.airlines = airlines;
		this.departingTime = departingTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.fare = fare;
		this.source = source;
		this.destination = destination;
		this.departingShift = departingShift;
		this.seatType = seatType;
	}

	public FlightDetailsCreate() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public Date getDepartingTime() {
		return departingTime;
	}

	public void setDepartingTime(Date departingTime) {
		this.departingTime = departingTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartingShift() {
		return departingShift;
	}

	public void setDepartingShift(String departingShift) {
		this.departingShift = departingShift;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="departing_shift")
	private String departingShift;
		
	@Column(name="seat_type")
	private String seatType;
	


}
