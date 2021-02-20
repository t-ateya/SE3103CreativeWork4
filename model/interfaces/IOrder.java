package model.interfaces;

import model.util.Address;
import model.implementation.Customer;
import model.util.Date;

public interface IOrder extends Comparable<IOrder> {
	public Address getShippingAddress();

	public void setShippingAddress(Address shippingAddress);

	public Customer getCustomer();

	public void setCustomer(Customer customer);

	// public ProductMap <Product> getProducts();

	// public void setProducts(ProductMap<Product> products);

	public Date getShippingDate();

	public void setShippingDate(Date date);

	public double getTotal();

}