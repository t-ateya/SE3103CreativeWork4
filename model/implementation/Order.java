package model.implementation;

import model.interfaces.IOrder;
import model.interfaces.IProduct;
import model.interfaces.IProductMap;
import model.util.Address;
import model.util.Date;


public class Order implements IOrder {
	String id;
	Customer Customer;
	IProductMap<String, IProduct>productsOfOrder;

	@Override
	public int compareTo(IOrder o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Address getShippingAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShippingAddress(Address shippingAddress) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Date getShippingDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShippingDate(Date date) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IProductMap<String, IProduct> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProducts(IProductMap<String, IProduct> products) {
		// TODO Auto-generated method stub

	}
	
}
