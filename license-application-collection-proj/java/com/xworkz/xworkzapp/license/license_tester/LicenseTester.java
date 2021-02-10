package com.xworkz.xworkzapp.license.license_tester;

import java.util.Date;

import com.xworkz.xworkzapp.license.constants.BloodGroup;
import com.xworkz.xworkzapp.license.constants.Gender;
import com.xworkz.xworkzapp.license.constants.IdProof;
import com.xworkz.xworkzapp.license.constants.VehicleType;
import com.xworkz.xworkzapp.license.dao.LicenseDAO;
import com.xworkz.xworkzapp.license.dao.LicenseDAOImpl;
import com.xworkz.xworkzapp.license.dto.AddressDTO;
import com.xworkz.xworkzapp.license.dto.DateOfBirthDTO;
import com.xworkz.xworkzapp.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
		
		AddressDTO addressDTO = new AddressDTO(19, "NA", 583101, "Basaveshwara nagar 2nd main", "Ballari", "karnataka", "veerabadreshwara krupa");
		System.out.println(addressDTO);
		
		DateOfBirthDTO dob = new DateOfBirthDTO(16,07,1998);
		System.out.println(dob);
		
		
		Date date = new Date();
		
		LicenseDTO dto = new LicenseDTO("Vaishu", 22, addressDTO, dob, 63611577699l, BloodGroup.AB_POSITIVE, Gender.FEMALE);
		dto.setIdProof(IdProof.ADDHARCARD);
		dto.setIdProofNo("21 73 20 00 32");
		dto.setVehicleType(VehicleType.TWO_WHEELER);
		dto.setStartdate(new Date());
		dto.setDisability(false);
		dto.setCommercial(false);
		
		LicenseDAO dao =new LicenseDAOImpl();
		dao.save(dto);
		
	}
	
}
