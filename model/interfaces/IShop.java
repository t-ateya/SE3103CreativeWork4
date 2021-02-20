package model.interfaces;

import java.util.List;

public interface IShop {
	public abstract List<IProduct> getProducts();

	public abstract void addProduct(IProduct product);

	public abstract void removeProduct(IProduct product);

	public abstract double getStockValue();

	public abstract void saveToFile(String fileName);

	public abstract List<IGame> sortedGames();

}
