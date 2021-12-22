package it.akademija.dao;

import java.util.List;

import it.akademija.carts.CartProduct;

public interface CartProductDao {
	List<CartProduct> getProducts();
	void createCartProduct(CartProduct cartProduct);
	void deleteCartProduct(String title);
	
}
