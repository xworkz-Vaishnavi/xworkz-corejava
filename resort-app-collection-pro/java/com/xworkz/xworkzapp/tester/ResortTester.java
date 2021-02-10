package com.xworkz.xworkzapp.tester;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.xworkzapp.dao.ResortDAO;
import com.xworkz.xworkzapp.dao.ResortDAOImpl;
import com.xworkz.xworkzapp.dto.ResortDTO;
public class ResortTester {

	public static void main(String[] args) {
		
		List<ResortDTO> list = new LinkedList<ResortDTO>();
		
		ResortDAO dao=new ResortDAOImpl(list);
		
		//ResortService resortService = new ResortServiceImpl(dao);
		
		ResortDTO dto = new ResortDTO("Rajnagara", "jalandar", "kiran", 15);
		dto.setPricePerHead(2000);
		dto.setNoOfEmployees(10);
		dto.setOffers(false);
		dto.setPhoneNo(1234567889l);
		dto.setPoolExist(false);
		dto.setRating(5);
		dao.save(dto);
		
		ResortDTO dto2 = new ResortDTO("Rajnagara", "jalandar", "kiran", 15);
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(15);
		dto2.setOffers(true);
		dto2.setPhoneNo(9876543211l);
		dto2.setPoolExist(false);
		dto2.setRating(3);
		dao.save(dto2);
		
		
		System.out.println(dao.totalResortSize());
		
		dao.updateLocationByName("Dandeli", "kaliAdventure");
		
		dao.updateLocationByNameandRating("coorg", "shilandara", 5);
		
		dao.deleteByNameAndLocation("shilandara", "coorg");
		
		dao.addMultipleResorts(list);
	}
}
