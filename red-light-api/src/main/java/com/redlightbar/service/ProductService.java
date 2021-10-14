package com.redlightbar.service;

import com.redlightbar.model.OrderSheet;
import com.redlightbar.model.Product;

public interface ProductService {
    Product saveProduct(Product product);
    Product findById(long id);
    Product updateProduct(Product product, long id);
    void deleteProduct(long id);
}
