package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constants.CosmeticsShade;
import com.xworkz.xworkzapp.constants.CosmeticsType;

public class CosmeticsDTO {

	private String brand;
	private CosmeticsShade shades;
	private CosmeticsType type;
	private double price;
	private int quantity;
	
	public CosmeticsDTO() {
		
	}

	public CosmeticsDTO(String brand, CosmeticsShade shades, CosmeticsType type, double price, int quantity) {
		super();
		this.brand = brand;
		this.shades = shades;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public CosmeticsShade getShades() {
		return shades;
	}

	public void setShades(CosmeticsShade shades) {
		this.shades = shades;
	}

	public CosmeticsType getType() {
		return type;
	}

	public void setType(CosmeticsType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticsDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof CosmeticsDTO) {
			CosmeticsDTO converted = (CosmeticsDTO) obj;
			
			if(this.brand != null &&  this.type != null) {
				if(this.brand.equals(converted.getBrand()) && this.type.equals(converted.getType())){
				System.out.println("brand and type is matching"+converted.brand);
				return true;
			}
		}
	}
		return false;
	}

	
}

