package com.xworkz.xworkzapp.celebration.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.xworkzapp.celebration.functional.Display;

public class DisplayServiceImpl implements DisplayService {

	private List<String> names;

	public DisplayServiceImpl() {
		this.names = new ArrayList<>();
		this.names.add("Steve Jobs");
		this.names.add("Elon Musk");
		this.names.add("James Gosling");
		this.names.add("Modi");
		this.names.add("Kalam");

	}

	@Override
	public void printString(Display display) {
		for (String string : names) {
			display.print(string," Indian");
		}

	}
}
