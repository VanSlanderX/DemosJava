package org.springframewok.delegatepatterndemo.service;

import org.springframewok.delegatepatterndemo.model.Product;

public interface ProductService {

    String create(Product product);

    String retrieve(String indice);

}
