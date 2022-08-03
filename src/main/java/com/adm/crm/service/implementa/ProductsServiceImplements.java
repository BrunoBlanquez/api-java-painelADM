package com.adm.crm.service.implementa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adm.crm.model.Products;
import com.adm.crm.repository.ProdutosRepository;
import com.adm.crm.service.ProductsService;

@Service
public class ProductsServiceImplements implements ProductsService {

	@Autowired
	private ProdutosRepository produtosRepository;
	
	@Override
	public List<Products> listAllProducts() {
		return this.produtosRepository.findAll();
	}

	@Override
	public Products listById(String code) {
		return this.produtosRepository
				.findById(code)
				.orElseThrow(() -> new IllegalArgumentException("ID not found"));
	}

	@Override
	public Products createNewProduct(Products product) {
		return this.produtosRepository.save(product);
	}
	
	@Override
	public Products updateProductInfo(Products product) {
		return this.produtosRepository.save(product);
	}

	@Override
	public void deleteProduct(String code) {
		this.produtosRepository.deleteById(code);
	}

}
