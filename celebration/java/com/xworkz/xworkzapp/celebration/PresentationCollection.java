package com.xworkz.xworkzapp.celebration;

import java.util.ArrayList;
import java.util.List;

public class PresentationCollection {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("c");
		list.add("web");

		list.size();
		System.out.println(list);
		System.out.println(list.size());

		List<String> list2 = new ArrayList<String>();
		list2.add("google");
		list2.add("chrome");
		 list.addAll(list2);
		System.out.println(list2);
		System.out.println(list.size());
		list.contains("java");// boolean
		System.out.println(list.contains("java"));
		list.containsAll(list2);
		System.out.println(list.containsAll(list2));// boolean
		list.equals(list.equals(list2));
		System.out.println(list.equals(list.equals(list2)));
		list.forEach(e -> System.out.println(e));
		System.out.println("invoking get");
		list.get(3);
		System.out.println(list.get(3));

		// list.remove("web");
		System.out.println(list.remove("web"));
		//System.out.println(list.indexOf("web"));
		System.out.println(list.isEmpty());
		
		System.out.println(list.toArray());
		System.out.println(list.toString());
		list.clear();
		System.out.println(list);

	}

}
