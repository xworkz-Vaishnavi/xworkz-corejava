package com.xworkz.xworkzapp.dto;

import java.util.Date;

import com.xworkz.xworkzapp.constants.BlooodGroup;
import com.xworkz.xworkzapp.constants.Gender;

public class CommonDTO {

	private String name;
	private int age;
	private AddressDTO addressDTO ;
	private Date DOB;
	private long mobileNo;
	private BlooodGroup bloodGroup;
	private Gender gender;
	
	
	public CommonDTO() {
		
	}
	public CommonDTO(String name, int age, AddressDTO addressDTO, Date dOB, long mobileNo, BlooodGroup bloodGroup,
			Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.addressDTO = addressDTO;
		DOB = dOB;
		this.mobileNo = mobileNo;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AddressDTO getAddressDTO() {
		return addressDTO;
	}
	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public BlooodGroup getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(BlooodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
}
