package com.xworkz.xworkzapp.services;

import com.xworkz.xworkzapp.constants.CosmeticsShade;
import com.xworkz.xworkzapp.constants.CosmeticsType;
import com.xworkz.xworkzapp.dto.CosmeticsDTO;

public class CosmeticServiceImpl implements CosmeticService {

	
	public CosmeticServiceImpl() {
		System.out.println("created CosmeticServiceImpl");
	}

	
	@Override
	public boolean validateAndSave(CosmeticsDTO cosmeticsDTO) {
		boolean validDate=false;
		if(cosmeticsDTO!=null) {
			System.out.println("dto is not null, will validate fields");
			String brand = cosmeticsDTO.getBrand();
			if(brand!=null && brand.length()>=3 && !brand.isEmpty() && !brand.equals(" ")) {
				System.out.println("brand is valid");
				validDate=true;
			}
			else {
				System.out.println("brand is invalid");
				validDate=false;
			}
			
			if(validDate) {
				CosmeticsType type=cosmeticsDTO.getType();
				if(type != null) {
					System.out.println("CosmeticType is valid");
					validDate=true;
				}
				else {
					System.out.println("CosmeticType is invalid");
					validDate=false;
				}
			}
			
			if(validDate) {
				CosmeticsShade shade = cosmeticsDTO.getShades();
				if(shade!=null) {
					System.out.println("Cosmeticshade is valid");
					validDate= true;
				}
				else {
					System.out.println("CosmeticsShade is invalid");
					validDate=false;
				}
			}
			
			if(validDate) {
				double price=cosmeticsDTO.getPrice();
				if(price>0) {
					System.out.println("price is valid");
					validDate= true;
				}
				else {
					System.out.println("price is invalid");
					validDate=false;
				}
			}
			
			
			if(validDate) {
				double quantity=cosmeticsDTO.getQuantity();
				if(quantity>0 && quantity <= 100) {
					System.out.println("quantity is valid");
					validDate= true;
				}
				else {
					System.out.println("quantity is invalid");
					validDate=false;
				}
			}
			
			if(validDate) {
					System.out.println("data is valid, can invoke dao");
				}
				else {
					System.out.println("dto is null, invalid data");
				}
			}
		return false;
	}

	
}
