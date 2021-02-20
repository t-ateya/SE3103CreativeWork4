package model.implementation;

import model.interfaces.IProduct;

public class Product implements IProduct {
	private String id;
	private double price;
	private static int count = 0;

	public Product(String id, int price) {
		this.id = id;
		this.price = price;

		count++;
	}

	@Override
	public int compareTo(IProduct product) {
		if (id.compareTo(product.getId()) != 0) {
			return this.id.compareTo(product.getId());
		} else if (this.price > product.getPrice()) {
			return 1;
		} else if (this.getPrice() < product.getPrice()) {
			return -1;
		}

		return 0;
	}

	@Override
	public String getId() {

		return id;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setId(String id) {
		this.id = id;

	}

	@Override
	public void setPrice(double price) {
		this.price = price;

	}

}
