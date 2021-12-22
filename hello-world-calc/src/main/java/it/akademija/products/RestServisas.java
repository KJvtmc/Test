package it.akademija.products;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import it.akademija.PagingData;

@RestController
@Api(tags = "product-servisas", description = "product Servisas")
@RequestMapping(value = "/product/list")
public class RestServisas {
	@Autowired
	private final ProductService productService;
	@Autowired
	@Qualifier("pagingData")
	private PagingData pagingData;
	
    public RestServisas(@Qualifier("productService") ProductService productService) {
		super();
		this.productService = productService;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value="Get products",notes="Returns products")
    public List<Product> getProducts() {
		pagingData.setLimit(10);
		return productService.getProducts()
				.stream()
				.map(p->new Product(p.getTitle(), p.getPrice(), p.getMaxQuantity()))
				.collect(Collectors.toList()); 
    }
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value="Save products",notes="Returns confirmation")
	public String saveProduct( String title, double price, int maxQuantity) {
		var product = new ProductFromService(title, price, maxQuantity);
		productService.setProduct(product);
		return "Product saved";
	}
}
