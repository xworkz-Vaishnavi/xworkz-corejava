package com.xworkz.xworkzapp.dao;

import java.util.List;

import com.xworkz.xworkzapp.constants.CosmeticsType;
import com.xworkz.xworkzapp.dto.CosmeticsDTO;

public interface CosmeticDAO {

	boolean save(CosmeticsDTO dto);
	
	boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand);
	
	boolean updateTypeByBrand(String brand);
	
	boolean deleteByBrand(String brand);
	
	void deleteAll();
	
	List<CosmeticsDTO> getAll();
	
	int TotalSize();

	CosmeticsDTO findbyQuantityAndBrand(int quantity, String brand);

	boolean updatePriceByBrandandType(double price, String brand, CosmeticsType type);

	boolean updateTypeByBrand(CosmeticsType type, String brand);
}
