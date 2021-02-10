package com.xworkz.xworkzapp.license.dto;

public class AddressDTO {

	private int doorNo;
	private String street;
	private int pincode;
	private String area;
	private String city;
	private String state;
	private String biulding;
	
	
	@Override
	public String toString() {
		return "AddressDTO [doorNo=" + doorNo + ", street=" + street + ", pincode=" + pincode + ", area=" + area
				+ ", city=" + city + ", state=" + state + "]";
	}


	public AddressDTO(int doorNo, String street, int pincode, String area, String city, String state, String biulding) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.state = state;
		this.biulding = biulding;
	}


	public int getDoorNo() {
		return doorNo;
	}


	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getBiulding() {
		return biulding;
	}


	public void setBiulding(String biulding) {
		this.biulding = biulding;
	}
	
	
}
	
