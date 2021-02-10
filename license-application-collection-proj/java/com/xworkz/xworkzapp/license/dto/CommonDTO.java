package com.xworkz.xworkzapp.license.dto;

public class CommonDTO {

	private String name;
	private int age;
	private AddressDTO addressDTO;
	private DateOfBirthDTO DOB;
	private long mobileNo;
	private BloodGroup bloodGroup;
	private Gender gender;
	
	
	public CommonDTO(String name, int age, AddressDTO addressDTO, DateOfBirthDTO dOB, long mobileNo,
			BloodGroup bloodGroup, Gender gender) {
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


	public DateOfBirthDTO getDOB() {
		return DOB;
	}


	public void setDOB(DateOfBirthDTO dOB) {
		DOB = dOB;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	
	
}
