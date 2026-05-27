package org.springframewok.delegatepatterndemo.expose.impl;

import lombok.AllArgsConstructor;
import org.springframewok.delegatepatterndemo.delegate.ProductDelegate;
import org.springframewok.delegatepatterndemo.model.Product;
import org.springframewok.delegatepatterndemo.service.ProductService;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductApiImpl implements ProductDelegate {

    private final ProductService productService;

    public String createNewProduct(Product product) {
        System.out.println("ProductApiImpl - createNewProduct");
        return productService.create(product);
    }

    public Product findProduct(String indice) {
        System.out.println("ProductApiImpl - findProduct() con indice:" + indice);
        return productService.retrieve(indice);
    }

}
