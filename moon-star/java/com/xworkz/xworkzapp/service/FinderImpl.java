package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.moondto.MenuDTO;
import com.xworkz.xworkzapp.moondto.MenuDTO.Type;

public class FinderImpl implements Finder{

	@Override
	public boolean test(MenuDTO dto) {
		System.out.println("test method");
		if (dto != null && dto.getType().equals(Type.NONVEG)) {
			return true;
		}
		return false;
	}
}
