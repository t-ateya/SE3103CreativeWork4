package model.implementation;

import model.interfaces.IComputer;

public class Computer extends Product implements IComputer{
	private String brand;
	private int ram;

	public Computer(String id, int price, String brand, int ram) {
		super(id, price);
		setBrand(brand);
		setRam(ram);
	}

	@Override
	public String getBrand() {

		return brand;
	}

	@Override
	public int getRam() {
		return ram;
	}

	@Override
	public void setBrand(String brand) {
		this.brand = brand;

	}

	@Override
	public void setRam(int ram) {
		this.ram = ram;

	}

	@Override
	public String toString() {
		return String.format("%s, \"brand\": \"%s\", \"ram\": \"%d\"}", super.toString(), getBrand(), getRam());
	}
	
}
