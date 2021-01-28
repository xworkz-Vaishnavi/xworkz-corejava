package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.constants.CosmeticsShade;
import com.xworkz.xworkzapp.constants.CosmeticsType;
import com.xworkz.xworkzapp.dto.CosmeticsDTO;
import com.xworkz.xworkzapp.services.CosmeticService;
import com.xworkz.xworkzapp.services.CosmeticServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {
		
		CosmeticsDTO cosmeticsDTO = new CosmeticsDTO();
		cosmeticsDTO.setType(CosmeticsType.CONSEALER);
		cosmeticsDTO.setPrice(1000);
		cosmeticsDTO.setShades(CosmeticsShade.RED);
		cosmeticsDTO.setBrand("MAC");
		cosmeticsDTO.setQuantity(-1);
		
		CosmeticService service = new CosmeticServiceImpl();
		service.validateAndSave(cosmeticsDTO);
	}
}
