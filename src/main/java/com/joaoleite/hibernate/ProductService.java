package com.joaoleite.hibernate;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ProductService {

	
	@Inject EntityManager entityManager;
	
	public List<Product> findAllProducts() {
		return entityManager.createQuery("SELECT p FROM Product p", Product.class).getResultList();
  }
  
  public void saveProduct(Product product) {
     entityManager.persist(product);
  }
}
