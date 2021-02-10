package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.constants.VehicleType;
import com.xworkz.xworkzapp.dto.LicenseDTO;

public interface LicenseDAO {

		void save(LicenseDTO dto);
		
		LicenseDTO findByIdProof(String idProofNo);
		
		boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type);
		

		
		
	
}
