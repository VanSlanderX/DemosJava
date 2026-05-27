package org.springframewok.delegatepatterndemo.service.impl;

import org.springframewok.delegatepatterndemo.model.Product;
import org.springframewok.delegatepatterndemo.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public String create(Product product) {
        System.out.println("ProductServiceImpl - create() con product: " + product);
        return "Exito al crear producto";
    }

    @Override
    public Product retrieve(String indice) {
        System.out.println("ProductServiceImpl - retrieve() con indice: " + indice);
        return new Product(1, "Tablet", "Samsung Tab S10 FE");
    }
}
