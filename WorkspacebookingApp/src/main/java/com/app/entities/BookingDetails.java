package com.app.entities;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookingdetails")
public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	@Column(name="intime",nullable=false)
	private Time inTime;
	
	@Column(name="outtime",nullable=false)
	private Time outTime;
	
	@Column(name="bookingdate",nullable=false)
	private Date bookingDate;
	
	
	

}
