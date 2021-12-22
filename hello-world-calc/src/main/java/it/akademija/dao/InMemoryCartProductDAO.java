package it.akademija.dao;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import it.akademija.carts.CartProduct;

public class InMemoryCartProductDAO implements CartProductDao {
	private final List<CartProduct> cartProducts = new CopyOnWriteArrayList<>();

	@Override
	public void deleteCartProduct(String title) {
		for (CartProduct product : cartProducts ) {
			if (title.equals(product.getTitle())) {
				cartProducts.remove(product);
				break;
			}
		}
	}

	@Override
	public List<CartProduct> getProducts() {
		return Collections.unmodifiableList(cartProducts);
	}

	@Override
//	@Autowired
	public void createCartProduct(CartProduct cartProduct) {
		cartProducts.add(cartProduct);
		
	}
}
