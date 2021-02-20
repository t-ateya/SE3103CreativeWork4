package model.interfaces;

public interface IProductMap <String, T extends IProduct> {
	public abstract void addOrder(String id, T t);
	public abstract void cancelOrder(String id);
	
}
