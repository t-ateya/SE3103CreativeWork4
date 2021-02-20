package model.implementation;

import java.util.Arrays;
import java.util.List;

import model.interfaces.ILaptop;

public class Laptop extends Computer implements ILaptop {
	public static final String [] BRANDS = {"HP", "MAC", "LENOVO"};

	public Laptop(String id, int price, String brand, int ram) {
		super(id, price, brand, ram);
		
	}

	@Override
	public void setBrand(String brand) {
		List<String>brandList = Arrays.asList(BRANDS);
		if (brandList.contains(brand)){
			super.setBrand(brand);
		}
		
	}

	@Override
	public void setId(String id) {
		if (id.startsWith("LP")){
			super.setId(id);
		}
		
	}
	
}
