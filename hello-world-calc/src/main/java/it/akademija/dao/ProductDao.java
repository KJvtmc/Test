package it.akademija.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import it.akademija.products.Product;


public interface ProductDao extends JpaRepository<Product, Long> {

}
