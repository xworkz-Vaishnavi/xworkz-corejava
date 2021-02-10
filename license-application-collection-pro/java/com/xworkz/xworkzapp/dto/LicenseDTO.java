package com.xworkz.xworkzapp.dto;

import java.util.Date;

import com.xworkz.xworkzapp.constants.BlooodGroup;
import com.xworkz.xworkzapp.constants.Gender;
import com.xworkz.xworkzapp.constants.IdProof;
import com.xworkz.xworkzapp.constants.VehicleType;

public class LicenseDTO extends CommonDTO {
	private IdProof idProof;
	private String idProofNo;
	private VehicleType vehicleType;
	private Date startdate;
	private boolean disability;
	private boolean commercial;
	private Object getIdProofNo;
	
	
	public LicenseDTO() {
		super();
	}
	
	public LicenseDTO(String name, int age, AddressDTO addressDTO, Date doB, long mobileNo, BlooodGroup bloodGroup, Gender gender) {
		
		super(name,age, addressDTO, doB, mobileNo,  bloodGroup, gender);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			System.out.println("object is null");
			return false;
		}
		if(obj instanceof LicenseDTO) {
			LicenseDTO converted = (LicenseDTO) obj;
			
			if(this.idProofNo != null && this.idProofNo.equals(converted.getIdProofNo)) {
				
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "LicenseDTO [idProofNo=" + idProofNo + ", disability=" + disability + ", commercial=" + commercial + "]";
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

	public Object getGetIdProofNo() {
		return getIdProofNo;
	}

	public void setGetIdProofNo(Object getIdProofNo) {
		this.getIdProofNo = getIdProofNo;
	}
	

	
	
}
