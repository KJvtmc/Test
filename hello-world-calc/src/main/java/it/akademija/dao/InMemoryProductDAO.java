//package it.akademija.dao;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//import it.akademija.products.Product;
//
//public class InMemoryProductDAO implements ProductDao {
//	private final List<Product> products = new CopyOnWriteArrayList<>();
//
//	@Override
//	public void deleteProduct(String title) {
//		for (Product product : products ) {
//			if (title.equals(product.getTitle())) {
//				products.remove(product);
//				break;
//			}
//		}
//	}
//
//	@Override
//	public List<Product> getProducts() {
//		return Collections.unmodifiableList(products);
//	}
//
//	@Override
////	@Autowired
//	public void createProduct(Product product) {
//		products.add(product);
//		
//	}
//}
