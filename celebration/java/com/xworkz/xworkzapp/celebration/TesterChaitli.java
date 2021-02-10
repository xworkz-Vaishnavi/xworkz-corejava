package com.xworkz.xworkzapp.celebration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesterChaitli {

	public static void main(String[] args) {

		Map<String, Integer> map=new HashMap<String, Integer>();
		
		String name="Elon Musk";
		int age=49;
		
		map.put(name, age);
		map.put("Steve Jobs", 54);//new Entry<String,Integer> 
		map.put("Kalam",83);
		map.put("LakshmiV",22);
		map.put("Yash",35);
		map.put("Pasha", 22);//un-belivable
		map.put("Skanda", 22);
		map.put(null, null);
		map.put("Rohan", null);
		System.out.println(map.size());
		
		Integer value=map.get("Yash");
		System.out.println(value);
		
		Set<String> keys=map.keySet();
		
		keys.forEach(anything->{
		Integer v=map.get(anything);
		System.out.println(anything +"age is "+v);
		});
		
		Collection<Integer> values=map.values();
		
		values.forEach(a->System.out.println(a));

		Set<Entry<String,Integer>> entrySet=map.entrySet();
		System.out.println(entrySet.size());
		entrySet.forEach(r->{
			System.out.println(r.getKey());
			System.out.println(r.getValue());
		});
		
		
		
		
		
	}
	
}
