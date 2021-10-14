package com.redlightbar.controller;

import com.redlightbar.exception.ResourceNotFoundException;
import com.redlightbar.model.Product;
import com.redlightbar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order-sheets")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @RequestMapping("/add")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        var savedProduct = productService.saveProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable("id") long id) {
        Product product = productService.findById(id);

        if (product == null) throw new ResourceNotFoundException(Product.class.getName(), "id", id);

        return new ResponseEntity<>(product, HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@RequestBody Product product, @PathVariable Long id) {
        return productService.updateProduct(product, id);
    }

    @DeleteMapping("/products/{id}")
    void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
