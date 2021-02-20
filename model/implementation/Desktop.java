package model.implementation;

import java.util.ArrayList;

import model.interfaces.IDesktop;

public class Desktop extends Computer implements IDesktop {
	public static ArrayList<String> BRANDS = new ArrayList<>();

	public Desktop(String id, int price, String brand, int ram) {
		super(id, price, brand, ram);

		BRANDS.add("HP");
		BRANDS.add("ASUS");
		BRANDS.add("DELL");

		setBrand(brand);

	}

	@Override
	public void setBrand(String brand) {
		if (BRANDS.contains(brand)){
			super.setBrand(brand);
		}
		
	}

	@Override
	public void setId(String id) {
		if (id.startsWith("DK")){
			super.setId(id);
		}
		
	}

}
