package com.xworkz.xworkzapp.dto;

public class BeachDTO implements Comparable<BeachDTO>{

	private String name;
	private int noOfResorts;
	private int iceLands;
	
	public BeachDTO() {
		
	}

	public BeachDTO(String name, int noOfResorts, int iceLands) {
		super();
		this.name = name;
		this.noOfResorts = noOfResorts;
		this.iceLands = iceLands;
	}
	
	
	@Override
	public int compareTo(BeachDTO o) {
		System.out.println("invoked compare to by name");
		//if(this.name.equals(o.name))return 0;
		int tempCompare=this.name.compareTo(o.getName()); //asce
		//int tempCompare=o.name.compareTo(this.getName());//desc
		
		System.out.println(tempCompare);
		return tempCompare;
	}
	
	public int compareToResort(BeachDTO o) {
		System.out.println("invoked compareTo");
		// 1 greater , 0 equal ,-1 less than
		
		//this>arg
		
		if(this.noOfResorts == o.noOfResorts) {
			System.out.println("equal" + noOfResorts);
			return 0;
		}
		
		if(this.noOfResorts > o.noOfResorts) {
			System.out.println("greater" + noOfResorts);
			return 100;
		}
		
		if(this.noOfResorts < o.noOfResorts) {
			System.out.println("lesser" + noOfResorts);
			return -10;
		}
		return 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNoOfResorts() {
		return noOfResorts;
	}
	
	@Override
	public String toString() {
		return "BeachDTO [name=" + name +", noOfResorts=" + noOfResorts +"]";
	}
}
