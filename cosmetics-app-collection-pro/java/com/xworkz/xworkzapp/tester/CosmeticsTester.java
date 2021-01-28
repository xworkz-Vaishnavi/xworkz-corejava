package com.xworkz.xworkzapp.tester;

import java.util.List;

import com.xworkz.xworkzapp.constants.CosmeticsShade;
import com.xworkz.xworkzapp.constants.CosmeticsType;
import com.xworkz.xworkzapp.dao.CosmeticDAO;
import com.xworkz.xworkzapp.dao.CosmeticDAOImpl;
import com.xworkz.xworkzapp.dto.CosmeticsDTO;

public class CosmeticsTester {

	public static void main(String[] args) {
		
		CosmeticsDTO cosmeticsDTO = new CosmeticsDTO();
		cosmeticsDTO.setBrand("Maybelline");
		cosmeticsDTO.setType(CosmeticsType.EYLINER);
		cosmeticsDTO.setQuantity(1);
		cosmeticsDTO.setShades(CosmeticsShade.RED);
		cosmeticsDTO.setPrice(200.00);
		
		CosmeticDAO dao = new CosmeticDAOImpl();
		dao.save(cosmeticsDTO);
		
		CosmeticsDTO cosmeticsDTO1 = new CosmeticsDTO("Lakme", CosmeticsShade.RED, CosmeticsType.LIPSTICK,200,1);
		dao.save(cosmeticsDTO1);
		
		CosmeticsDTO cosmeticsDTO2 = new CosmeticsDTO("Lakme", CosmeticsShade.RED, CosmeticsType.LIPSTICK,200,1);
		dao.save(cosmeticsDTO2);
		
		CosmeticsDTO cosmeticsDTO3 = new CosmeticsDTO("Nyka", CosmeticsShade.CREAME, CosmeticsType.FOUNDATION,300,1);
		dao.save(cosmeticsDTO3);
		
		
		boolean updated =dao.updatePriceAndQuantityByBrand(50000.00, 40, "Nyka");
		System.out.println("updated"+updated);
		System.out.println(cosmeticsDTO3);
		
		boolean updated1=dao.updatePriceByBrandandType(600000, "Lakme", CosmeticsType.FOUNDATION);
		System.out.println("updated"+updated);
		System.out.println(cosmeticsDTO2);
		
			List<CosmeticsDTO> get1=dao.getAll();
			System.out.println("getting all the elements");
			
			int total1=dao.TotalSize();
			System.out.println("total size"+total1);
			
			boolean update2=dao.updateTypeByBrand(CosmeticsType.CONSEALER, "Maybelline");
			System.out.println("updated"+updated);
			System.out.println(cosmeticsDTO);
			
			boolean delete=dao.deleteByBrand("Nyka");
			System.out.println("deleted"+delete);
			int total2=dao.TotalSize();
			System.out.println("total size"+total2);
			
			dao.deleteAll();
			
			List<CosmeticsDTO> get=dao.getAll();
			System.out.println(get);
			
			int total = dao.TotalSize();
			System.out.println("total size"+total);
	}
		
}
