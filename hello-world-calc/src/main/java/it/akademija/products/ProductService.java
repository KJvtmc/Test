package it.akademija.products;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import it.akademija.dao.ProductDao;

@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;
	

	@Transactional(readOnly = true)
	public List<ProductFromService> getProducts() {
		return productDao.findAll().stream()
				.map(p -> new ProductFromService(p.getTitle(),p.getPrice(),p.getQuantity()))
				.collect(Collectors.toList()); 
	}
	@Transactional
	public void setProduct(ProductFromService productFromService) {
		var product = new Product(productFromService.getTitle(),productFromService.getPrice(),productFromService.getMaxQuantity());
		productDao.save(product);
	}


	public ProductDao getProductDao() {
		return productDao;
	}


	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
