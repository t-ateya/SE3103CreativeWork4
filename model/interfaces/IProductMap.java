package model.interfaces;

public interface IProductMap <String , T extends IOrder> {
	public abstract void addOrder(String id, T t);
	public abstract void cancelOrder(String id);
	
}
