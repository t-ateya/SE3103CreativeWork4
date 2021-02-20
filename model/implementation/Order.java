package model.implementation;

import model.interfaces.IOrder;
import model.interfaces.IProduct;
import model.interfaces.IProductMap;
import model.util.Address;
import model.util.Date;


public class Order implements IOrder {
	private String id;
	private Customer customer;
	private IProductMap<IProduct>productsOfOrder;
	private Address shippingAddress;
	private Date shippingDate;
	
	public Order(String id, Customer customer, IProductMap<IProduct>products, Address shippAddress, Date shippingDate){
		this.id = id;
		this.customer = customer;
		this.productsOfOrder = products;
		this.shippingAddress = shippAddress;
		this.shippingDate = shippingDate;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public IProductMap<IProduct> getProductsOfOrder() {
		return productsOfOrder;
	}
	public void setProductsOfOrder(IProductMap<IProduct> item) {
		this.productsOfOrder = item;
	}
	

	@Override
	public Address getShippingAddress() {
		
		return shippingAddress;
	}

	@Override
	public void setShippingAddress(Address shippingAddress) {
	this.shippingAddress = shippingAddress;

	}

	@Override
	public Customer getCustomer() {
		return this.customer;
	}

	@Override
	public void setCustomer(Customer customer) {

		this.customer = customer;
	}

	@Override
	public Date getShippingDate() {
		return shippingDate;
	}

	@Override
	public void setShippingDate(Date date) {

	}

	@Override
	public double getTotal() {
		return 0;
	}

	@Override
	public IProductMap<IProduct> getProducts() {
		return null;
	}

	@Override
	public void setProducts(IProductMap<IProduct> products) {

	}

	@Override
	public int compareTo(IOrder o) {
		return 0;
	}
	
}
