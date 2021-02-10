package com.xworkz.xworkzapp.service;

import java.util.List;
import com.xworkz.xworkzapp.dto.ResortDTO;

public interface ResortService {
	
	boolean validateAndSave(ResortDTO dto);
	
	boolean validateAndDeleteByNameAndLocation(String name, String location);
	
	int validateTotalResortSize();

	boolean validdateAndUpdateLocationByName(String location, String name);
	
	boolean validateAndMultipleResorts(List<ResortDTO> dtos);

	boolean validateAndUpdateLocationByNameandRating(String location, String name, float rating);


	
}
