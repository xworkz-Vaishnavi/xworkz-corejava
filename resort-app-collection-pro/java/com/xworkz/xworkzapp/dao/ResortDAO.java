package com.xworkz.xworkzapp.dao;

import java.util.List;

import com.xworkz.xworkzapp.dto.ResortDTO;

public interface ResortDAO {

	boolean save(ResortDTO dto);

	int totalResortSize();

	List<ResortDTO> getAll();

	boolean addMultipleResorts(List<ResortDTO> dtos);

	boolean deleteByNameAndLocation(String name, String location);

	boolean updateLocationByNameandRating(String location, String name, float rating);

	boolean updateLocationByName(String location, String name);
}
