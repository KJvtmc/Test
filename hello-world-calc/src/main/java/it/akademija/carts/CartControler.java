package it.akademija.carts;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import it.akademija.dao.CartProductDao;

@RestController
@RequestMapping(value = "/cart/list")
public class CartControler {

	private final CartProductDao cartProductDao;

	@Autowired
	public CartControler(@Qualifier("inMemoryCartProductDAO") CartProductDao cartProductDao) {
		super();
		this.cartProductDao = cartProductDao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<CartProduct> getProducts() {
		return cartProductDao.getProducts();
	}

}
