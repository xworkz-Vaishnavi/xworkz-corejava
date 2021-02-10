package com.xworkz.monumentslistiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MonumentListIterator {

	public static void main(String[] args) {
		
		List<String> monuments=new ArrayList<String>();
		monuments.add("Taj mahal");
		
		
		String charMinar="charMinar";
		monuments.add(charMinar);
		
		
		monuments.add("statue of liberty");
		monuments.add("mysore palace");
		monuments.add("vidhana soudha");
		monuments.add("hampi");
		
		ListIterator<String> listIterator= monuments.listIterator(4);
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println(listIterator.previousIndex());
		
		
		System.out.println("*************=================*************");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
	}
}
