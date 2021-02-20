package model.interfaces;

public interface IProduct extends Comparable <IProduct>{
	public abstract String getId();
	public abstract double getPrice();

	public abstract void setId(String id);
	public abstract void setPrice(double price);

	
}
