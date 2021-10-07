package com.redlightbar.service.impl;

import com.redlightbar.model.Product;
import com.redlightbar.repository.ProductRepository;
import com.redlightbar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultProductService implements ProductService {

	private ProductRepository productRepository;

	@Autowired
	public DefaultProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
}
