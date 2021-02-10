package com.xworkz.xworkzapp.service;

import java.util.List;

import com.xworkz.xworkzapp.dao.ResortDAO;
import com.xworkz.xworkzapp.dto.ResortDTO;

public class ResortServiceImpl implements ResortService{

	private ResortDAO resortDao;
	String specialChar = "^[^<>'\"/;'%]*$";
	public ResortServiceImpl(ResortDAO reesortDao) {
		System.out.println("invoked ResortServiceImpl");
		this.resortDao=resortDao;
	}
	
	@Override
	public boolean validateAndSave(ResortDTO dto) {
		boolean validData = false;
		if(dto != null) {
			System.out.println("dto is not null, can save fields");
			String location = dto.getLocation();
			CharSequence specialChar = "@#$%^&!*";
			if(location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
					&& !location.contains(" ") && !location.contains(specialChar)) {
				System.out.println("location  is  valid");
				validData = true;
			}else {
				System.out.println("location is not valid");
				validData = false;
			}
			if(validData) {
				String name = dto.getName();
				if(name != null && name.length()>=3 && name.length()<=15 && !name.isEmpty()
						&& !name.contains(" ")) {
					System.out.println("name is valid");
					validData=true;
				}else {
					System.out.println("name is valid");
					validData=false;
				}
			}
			if(validData) {
				double pricePerHead=dto.getPricePerHead();
				if(pricePerHead>=999 && pricePerHead <= 2500) {
					System.out.println("pricePerHead is valid");
					validData =true;
				}else {
					System.out.println("pricePerHead is invalid");
					validData=false;
				}
			}
			if(validData) {
				float rating = dto.getRating();
				if(rating>=0 && rating <=5) {
					System.out.println("rating is valid");
					validData = true;
				}else {
					System.out.println("rating is invalid");
					validData = false;
				}
			}
			if(validData) {
				long phoneNumber = dto.getPhoneNo();
				if(phoneNumber>7000000000l && phoneNumber <=10000000000l) {
					System.out.println("phone number is valid");
					validData =true;
				}else {
					System.out.println("phone number is invalid");
					validData = false;
				}
			}
			if(validData) {
				String managerName = dto.getManagerName();
				if(managerName != null && managerName.length()>=3 && managerName.length()<=12
						&& !managerName.isEmpty() && !managerName.contains(" ")) {
					System.out.println("manager name is valid");
					validData = true;
				}else {
					System.out.println("manager name is invalid");
					validData = false;
				}
			}
			if(validData) {
				int numberOfEmployee=dto.getNoOfEmployees();
				if(numberOfEmployee >= 5 && numberOfEmployee <=25) {
					System.out.println("number of emplyee is valid");
					validData = false;
				}else {
					System.out.println("number of employee is invalid");
					validData = false;
				}
			}
			if(validData) {
				boolean poolExist = dto.isPoolExist();
				if(poolExist==false) {
					System.out.println("pool exist is always false");
					validData = true;
				}else {
					System.out.println("pool exist is not valid");
					validData = false;
				}
			}
			if(validData) {
				System.out.println("All data is valid");
				this.resortDao.save(dto);
			}
		}else {
			System.out.println("dto is null can not save fields");
		}
		return false;
	}
	
	@Override
	public boolean validdateAndUpdateLocationByName(String location, String name) {
		System.out.println("invoked validateAndDeleteByNameAndLocation");
		if(name!=null && name.length()>=3 && name.length()<=15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length()>=3 && location.length()<=15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar)) {
			this.resortDao.updateLocationByName(location, name);
			return true;
		}else {
			System.out.println("name and location are not valid");
		}
		return false;
	}
	
	@Override
	public boolean validateAndUpdateLocationByNameandRating(String location, String name, float rating) {
		System.out.println("invoked validateAndUpdateLocationByNameandString");
		if(name!=null && name.length()>=3 && name.length()<=15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length()>=3 && location.length()<=15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar)) {
			this.resortDao.updateLocationByNameandRating(location, name, rating);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean validateAndDeleteByNameAndLocation(String name, String location) {
		//CharSequence specialChar = "@#$%^&!*";
		System.out.println("invoked validdateAndDeleteByNameAndLocation");
		if(name!=null && name.length()>=3 && name.length()<=15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length()>=3 && location.length()<=15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar)) {
			this.resortDao.deleteByNameAndLocation(name, location);
			return true;
		}else {
			System.out.println("name and location are not valid");
		}
		return false;
	}

	@Override
	public int validateTotalResortSize() {
		return this.resortDao.totalResortSize();
	}

	@Override
	public boolean validateAndMultipleResorts(List<ResortDTO> dtos) {
		System.out.println("invoked validateAndMultipleResorts");
		boolean valid = false;
		if(dtos!=null && dtos.size()>0) {
			int size=dtos.size();
			int tempSize=0;
				boolean saved=resortDao.addMultipleResorts(dtos);
				if(!saved) {
					System.out.println("dto not saved");
					valid = false;
				}else {
					System.out.println("dto saved");
					tempSize++;
				}
			if(tempSize==size) {
				valid=true;
			}
		}
		return valid;
	}
}
