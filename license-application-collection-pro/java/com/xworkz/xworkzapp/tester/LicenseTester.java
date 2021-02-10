package com.xworkz.xworkzapp.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.xworkz.xworkzapp.constants.BlooodGroup;
import com.xworkz.xworkzapp.constants.Gender;
import com.xworkz.xworkzapp.constants.IdProof;
import com.xworkz.xworkzapp.constants.VehicleType;
import com.xworkz.xworkzapp.dao.LicenseDAO;
import com.xworkz.xworkzapp.dao.LicenseDAOImpl;
import com.xworkz.xworkzapp.dto.AddressDTO;
import com.xworkz.xworkzapp.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
		
		AddressDTO addressDTO = new AddressDTO(283, "NA", 583104, "Basaveshwara nagar", "Ballari", "KA", "NA");
		Date dob = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			dob = format.parse("16/07/1998");
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		LicenseDTO dto = new LicenseDTO("Vaishu" , 22, addressDTO, dob, 6361157769l, BlooodGroup.AB_POSITIVE, Gender.FEMALE);
		dto.setIdProof(IdProof.AADHAR);
		dto.setIdProofNo("2345 6766 6787");
		dto.setCommercial(false);
		dto.setDisability(false);
		dto.setStartdate(new Date());//change to future
		dto.setVehicleType(VehicleType.TWO_WHEELER);
		
		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(dto);//DAO
		
		//CRUD-----
		
		LicenseDTO dtoFound = dao.findByIdProof("2345 6766 6787");
		System.out.println(dtoFound);
		
		boolean updated = dao.updateVehicleTypeByIdProofNo("2345 6766 6787", VehicleType.LMV);
		System.out.println("updated" + updated);
		
		LicenseDTO dtoafterUpdate = dao.findByIdProof("2345 6766 6787");
		System.out.println(dtoafterUpdate);
		
	}
}
