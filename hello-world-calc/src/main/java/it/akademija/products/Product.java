package it.akademija.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Entity
@Table(name = "produktai")
public class Product{
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	@NotNull
	@Length(min = 1, max = 30)
	public String title;
	@Column
	@NotNull
	public double price;
	@Column
	@NotNull
	public int maxQuantity;
	
	public Product() {
	}
	public Product(String title, double price, int quantity) {
		super();
		this.title = title;
		this.price = price;
		this.maxQuantity = quantity;
	}
	
	public String getTitle() {
		return title;
	}
	@Qualifier("itemTitle")
	@Autowired
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	@Qualifier("itemPriceD")
	@Autowired
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return maxQuantity;
	}
	@Qualifier("itemQuantityInt")
	@Autowired
	public void setQuantity(int quantity) {
		this.maxQuantity = quantity;
	};
}
