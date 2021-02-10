package com.xworkz.xworkzapp.solutions.Tester;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.xworkzapp.solutions.dto.*;


public class ShoppingCartTester {

	public static void main(String[] args) {
		
		ShoppingCartDTO cartDTO1 = new ShoppingCartDTO();
		cartDTO1.setItemName("Jeans");
		cartDTO1.setPrice(2000);
		cartDTO1.setQuantity(1);
		
		ShoppingCartDTO cartDTO2 = new ShoppingCartDTO();
		cartDTO2.setItemName("kurti");
		cartDTO2.setPrice(3000);
		cartDTO2.setQuantity(1);
		
		Collection<ShoppingCartDTO> cartDTOs = new ArrayList<ShoppingCartDTO>();
		cartDTOs.add(cartDTO2);
		cartDTOs.add(cartDTO1);
		
		ShoppingCartDTO cartDTO3 = new ShoppingCartDTO();
		cartDTO3.setItemName("sneakers");
		cartDTO3.setPrice(4000);
		cartDTO3.setQuantity(1);
		
		
		boolean contain = cartDTOs.contains(cartDTO3);
		System.out.println("contains"+contain);
		
		/*
		 * for(ShoppingCartDTO ShoppingCartDTO : cartDTOs) {
		 * if(ShoppingCartDTO.getItemName().equals("sneakers")) {
		 * System.out.println("Sneakers is in cart"); } else {
		 * System.out.println("Sneakers is not in cart, can add"); } }
		 */
	if(contain) 
	{
		System.out.println("Sneakers is in cart");
	}
	else
	{
		System.out.println("adding Sneakers to cart");
		cartDTOs.add(cartDTO3);
	}
	System.out.println("after adding sneakers"+ cartDTOs.size());
	
}
	
}

