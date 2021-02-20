package model.interfaces;

public interface IComputer extends IProduct {
	public abstract String getBrand();

	public abstract int getRam();

	public abstract void setBrand(String brand);
	public abstract void setRam(int ram);
}
