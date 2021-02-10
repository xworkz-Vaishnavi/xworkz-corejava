uuu package com.xworkz.xworkzapp.license.dto;

import java.util.Date;

import com.xworkz.xworkzapp.license.constants.BloodGroup;
import com.xworkz.xworkzapp.license.constants.Gender;
import com.xworkz.xworkzapp.license.constants.IdProof;
import com.xworkz.xworkzapp.license.constants.VehicleType;

public class LicenseDTO extends CommonDTO {

	private IdProof idProof;hjjj
	private String idProofNo;
	private VehicleType vehicleType;
	private Date startdate;
	private boolean disability;
	private boolean commercial;
	
	
	
	public LicenseDTO(String name, int age, AddressDTO addressDTO, DateOfBirthDTO dob, long mobileNo, IdProof idProof, String idProofNo, VehicleType vehicleType, BloodGroup bloodGroup, Gender gender,
			Date startdate, boolean disability, boolean commercial) {
		super();
		this.idProof = idProof;
		this.idProofNo = idProofNo;
		this.vehicleType = vehicleType;
		this.startdate = startdate;
		this.disability = disability;
		this.commercial = commercial;
	}
	
	



	public IdProof getIdProof() {
		return idProof;
	}



	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}



	public String getIdProofNo() {
		return idProofNo;
	}



	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}



	public VehicleType getVehicleType() {
		return vehicleType;
	}



	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}



	public Date getStartdate() {
		return startdate;
	}



	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}



	public boolean isDisability() {
		return disability;
	}



	public void setDisability(boolean disability) {
		this.disability = disability;
	}



	public boolean isCommercial() {
		return commercial;
	}



	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}
	
	
	
}
