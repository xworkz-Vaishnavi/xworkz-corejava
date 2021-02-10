package com.xworkz.xworkzapp.tester;

import java.util.Collections;

import com.xworkz.xworkzapp.moondto.MenuDTO;
import com.xworkz.xworkzapp.service.Finder;
import com.xworkz.xworkzapp.service.RestaurantService;
import com.xworkz.xworkzapp.service.RestaurantServiceImpl;

public class TesterSathya {

	public static void main(String[] args) {

		RestaurantService restaurantService = new RestaurantServiceImpl();

		// restaurantService.displayItemGreaterThan(200);
		/*
		 * Finder finder=new FinderImpl(); finder=new VegFinderImpl();
		 */
//Functional Interface
		restaurantService.findAndDisplay(new Finder() {
			@Override
			public boolean test(MenuDTO dto) {
				if (dto.getPrice() < 200) {
					return true;
				}
				return false;
			}

		});
//(ref)->{};
		//() is required if you have more than one param
		//more than one statement
		restaurantService.findAndDisplay(d->d.getPrice()>300);
		
		Collections.sort(list);
	}
}
