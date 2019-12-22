package com.joaoleite.hibernate;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/products")
public class ProductResource {
	
	@Inject ProductService productService;
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public List<Product> getProducts() {
		return productService.findAllProducts();
	}
	
	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	public void addProduct(Product product) {
		productService.saveProduct(product);
	}
}
