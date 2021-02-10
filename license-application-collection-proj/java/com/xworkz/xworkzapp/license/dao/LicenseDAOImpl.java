package com.xworkz.xworkzapp.license.dao;

import com.xworkz.xworkzapp.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO {

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save"+dto);
		
	}
	

}
