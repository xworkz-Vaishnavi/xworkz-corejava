package com.xworkz.xworkzapp.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.xworkzapp.dao.ResortDAO;
import com.xworkz.xworkzapp.dao.ResortDAOImpl;
import com.xworkz.xworkzapp.dto.ResortDTO;
import com.xworkz.xworkzapp.service.ResortService;
import com.xworkz.xworkzapp.service.ResortServiceImpl;

public class ResortValidationTester {

	public static void main(String[] args) {
		
			List<ResortDTO> list = new ArrayList<ResortDTO>();
			
			ResortDAO dao = new ResortDAOImpl(list);
			ResortService resortService = new ResortServiceImpl(dao);
			
			ResortDTO dto = new ResortDTO("Rajnagar", "jalandar", "kiran", 15);
			dto.setPricePerHead(2000);
			dto.setNoOfEmployees(10);
			dto.setOffers(false);
			dto.setPhoneNo(1234567890l);
			dto.setPoolExist(false);
			dto.setRating(4);
			//dao.save(dto);
			
			resortService.validateAndSave(dto);
			
			

			ResortDTO dto2 = new ResortDTO("Dandeli", "KaliAdventure", "Raj", 10);
			dto.setPricePerHead(2000);
			dto.setNoOfEmployees(10);
			dto.setOffers(false);
			dto.setPhoneNo(1234567890l);
			dto.setPoolExist(false);
			dto.setRating(4);
			
			resortService.validateAndSave(dto2);
			
			System.out.println(resortService.validateTotalResortSize());
			
			resortService.validateAndMultipleResorts(list);
			
			resortService.validdateAndUpdateLocationByName("coorg", "KaliAdventure");
			
			resortService.validateAndUpdateLocationByNameandRating("madikeri", "jalandar", 5);
			
			resortService.validateAndDeleteByNameAndLocation("jalandar", "madikeri");
			
			System.out.println(resortService.validateTotalResortSize());
			
			System.out.println();
	}
}
