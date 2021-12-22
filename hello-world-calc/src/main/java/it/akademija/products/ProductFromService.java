package it.akademija.products;

public class ProductFromService {
	
	public String title;
	public double price;
	public int maxQuantity;
	
	public ProductFromService() {
	}
	
	public ProductFromService(String title, double price, int maxQuantity) {
		super();
		this.title = title;
		this.price = price;
		this.maxQuantity = maxQuantity;
	}
	
	public ProductFromService(String title) {
		super();
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMaxQuantity() {
		return maxQuantity;
	}
	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}
}
