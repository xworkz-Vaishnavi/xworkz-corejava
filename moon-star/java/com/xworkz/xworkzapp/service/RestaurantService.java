package com.xworkz.xworkzapp.service;

public interface RestaurantService {

	public void displayItemGreaterThan(double price);

	public void displayByName(String name);

	public void findAndDisplay(Finder finder);
}
