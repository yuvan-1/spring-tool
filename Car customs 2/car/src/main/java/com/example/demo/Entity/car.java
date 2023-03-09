package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Car")


public class car {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	@Column(name = "carName")
	private String carName;
	@Column(name = "carType")
	private String carType;
	@Column(name = "owners")
	private int owners;
	@Column(name = "currentOwnerName")
	private String currentOwnerName;
	@Column(name = "mobile")
	private long mobile;
	@Column(name = "address")
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getOwners() {
		return owners;
	}
	public void setOwners(int owners) {
		this.owners = owners;
	}
	public String getCurrentOwnerName() {
		return currentOwnerName;
	}
	public void setCurrentOwnerName(String currentOwnerName) {
		this.currentOwnerName = currentOwnerName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public car(int id, String carName, String carType, int owners, String currentOwnerName, long mobile,
			String address) {
		super();
		this.id = id;
		this.carName = carName;
		this.carType = carType;
		this.owners = owners;
		this.currentOwnerName = currentOwnerName;
		this.mobile = mobile;
		this.address = address;
	}
	public car() {
		
	}
	
}
