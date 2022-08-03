package com.adm.crm.service;

import java.util.List;

import com.adm.crm.model.Products;

public interface ProductsService {

	public List<Products> listAllProducts();
	
	public Products listById(String code);
	
	public Products createNewProduct(Products product);
	
	public Products updateProductInfo(Products product);
	
	public void deleteProduct(String code);
}
