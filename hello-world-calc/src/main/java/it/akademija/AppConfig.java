package it.akademija;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import it.akademija.carts.CartProduct;
//import it.akademija.dao.DBUserDAO;
import it.akademija.dao.InMemoryCartProductDAO;
//import it.akademija.dao.InMemoryProductDAO;
//import it.akademija.dao.InMemoryUserDAO;
import it.akademija.products.Product;
import it.akademija.users.User;
//import it.akademija.users.UserService;
//import org.springframework.context.annotation.ImportResource;
//@ImportResource({"classpath*:application-context.xml"})
@Configuration
public class AppConfig {
	
	//Services
	
//	@Bean(name="userService")
//	public UserService getUserService() {
//		return new UserService();
//	}
	
//	@Bean(name="pagingData")
//	public PagingData getPagingData() {
//		return new PagingData();
//	}
//	
	//Objects
	
	@Bean(name="product")
	public Product getProduct() {
		return new Product();
	}

	@Bean(name="cartProduct")
	public CartProduct getCartProduct() {
		return new CartProduct();
	}
	
	@Bean(name="user")
	public User getUser() {
		return new User();
	}
	
	//DAO
	
//	@Bean(name="inMemoryProductDAO")
//	public InMemoryProductDAO getProductDao() {
//		return new InMemoryProductDAO();
//	}
	@Bean(name="inMemoryCartProductDAO")
	public InMemoryCartProductDAO getCartProductDao() {
		return new InMemoryCartProductDAO();
	}
	
//	@Bean(name="userDaoInMemory")
//	public InMemoryUserDAO getUserDao() {
//		return new InMemoryUserDAO();
//	}
//	
//	@Bean(name="dBUserDAO")
//	public DBUserDAO getDBUserDao() {
//		return new DBUserDAO();
//	}
	
	//Strings
	
	@Bean(name="itemTitle")
	public String getTitleString() {
		return "DefaultTitle";
	}
	
	@Bean(name="itemPrice")
	public String getPriceString() {
		return "DefaultPrice";
	}
	
	@Bean(name="itemQuantity")
	public String getQuantityString() {
		return "DefaultQuantity";
	}
	

	@Bean(name="itemPriceD")
	public double getPriceDouble() {
		return 0;
	}
	
	@Bean(name="itemQuantityInt")
	public int getQuantityInt() {
		return 0;
	}
	
	@Bean(name="itemUserName")
	public String getUserNameString() {
		return "DefaultUserName";
	}
	
	@Bean(name="itemFirstName")
	public String getFirstName() {
		return "DefaultFirstName";
	}
	
	@Bean(name="itemLastName")
	public String getLastNameString() {
		return "DefaultLastName";
	}
}