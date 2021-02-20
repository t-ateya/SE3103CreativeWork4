package model.interfaces;

public interface OrderMap <String, T extends Order> {
	public abstract void addOrder(String id, T t);
	public abstract void cancelOrder(String id);
	
}
