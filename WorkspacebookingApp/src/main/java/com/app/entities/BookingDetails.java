package com.app.entities;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * @author Madhu
 *
 */
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="empId",nullable=false)
	private Employee employeeFKey;
	
	@ManyToMany
	@JoinTable(name = "room_bookings",
            joinColumns = {@JoinColumn(name = "res_booking_id", referencedColumnName = "bookingId")},
            inverseJoinColumns = {@JoinColumn(name = "room_no", referencedColumnName = "roomId")})
    private List<ConferenceRoom> rooms;
	
	
	
	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Time getInTime() {
		return inTime;
	}

	public void setInTime(Time inTime) {
		this.inTime = inTime;
	}

	public Time getOutTime() {
		return outTime;
	}

	public void setOutTime(Time outTime) {
		this.outTime = outTime;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Employee getEmployeeFKey() {
		return employeeFKey;
	}

	public void setEmployeeFKey(Employee employeeFKey) {
		this.employeeFKey = employeeFKey;
	}

	public List<ConferenceRoom> getRooms() {
		return rooms;
	}

	public void setRooms(List<ConferenceRoom> rooms) {
		this.rooms = rooms;
	}
	
	

}