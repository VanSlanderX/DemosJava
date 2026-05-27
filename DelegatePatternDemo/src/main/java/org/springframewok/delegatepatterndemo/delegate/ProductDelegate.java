package org.springframewok.delegatepatterndemo.delegate;

import org.springframewok.delegatepatterndemo.model.Product;

public interface ProductDelegate {

    default String createNewProduct(Product product) {
        System.out.println("ProductDelegate - createNewProduct");
        String resultado = null;
        return resultado;
    }

    default Product findProduct(String indice) {
        System.out.println("ProductDelegate - findProduct() con indice:" + indice);
        Product resultado = new Product();
        return resultado;
    }
}
