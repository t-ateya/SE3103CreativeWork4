package model.interfaces;

public interface IProductMap <T extends IProduct> {
	public abstract void addOrder(String id, T t);
	public abstract void cancelOrder(String id);
	
}
