package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.moondto.MenuDTO;
import com.xworkz.xworkzapp.moondto.MenuDTO.Type;

public class VegFinderImpl implements Finder{

	@Override
	public boolean test(MenuDTO dto) {

		if (dto != null && dto.getType().equals(Type.VEG)) {
			return true;
		}
		return false;
	}
}
