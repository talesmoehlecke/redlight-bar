package com.redlightbar.service.impl;

import com.redlightbar.model.Product;
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

	@Override
	public Product findById(long id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product updateProduct(Product product, long id) {
		Product oldProduct = findById(id);
		if (oldProduct != null){
			oldProduct.setName(product.getName());
			oldProduct.setDescription(product.getDescription());
			oldProduct.setPrice(product.getPrice());
			return saveProduct(oldProduct);
		} else {
			product.setId(id);
			return saveProduct(product);
		}
	}

	@Override
	public void deleteProduct(long id) {
		productRepository.deleteById(id);
	}


}
