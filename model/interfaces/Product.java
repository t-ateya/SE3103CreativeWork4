package model.interfaces;

public interface Product extends Comparable <Product>{
	public abstract String geetId();
	public abstract double getPrice();

	public abstract void setId(String id);
	public abstract void setPrice(double price);

	
}
