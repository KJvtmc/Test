package it.akademija.carts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CartProduct{

	public String title;
	public String price;
	public String quantity;
	public CartProduct() {
	}
	public CartProduct(String title, String price, String quantity) {
		super();
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getTitle() {
		return title;
	}
	@Qualifier("itemTitle")
	@Autowired
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	@Qualifier("itemPrice")
	@Autowired
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	@Qualifier("itemQuantity")
	@Autowired
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	};
}
