package com.xworkz.xworkzapp.celebration;

import com.xworkz.xworkzapp.celebration.service.DisplayService;
import com.xworkz.xworkzapp.celebration.service.DisplayServiceImpl;

public class TesterLakshmiV {

	public static void main(String[] args) {

		DisplayService service=new DisplayServiceImpl();
		
		service.printString((l,t)->{
			System.out.println("validating"+l + " t"+t);
			if(l.contains("a") || l.contains("A"))
			{
				System.out.println(l+ " "+l.hashCode());
			}
		});
		
		
	}
}
