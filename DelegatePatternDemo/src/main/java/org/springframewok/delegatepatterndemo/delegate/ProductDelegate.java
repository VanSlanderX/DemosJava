package org.springframewok.delegatepatterndemo.delegate;

import org.springframewok.delegatepatterndemo.model.Product;

public interface ProductDelegate {

    default String createNewProduct(Product product) {
        System.out.println("ProductDelegate - createNewProduct");
        String resultado = null;
        return resultado;
    }

    default String findProduct(String indice) {
        System.out.println("ProductDelegate - findProduct() con indice:" + indice);
        String resultado = null;
        return resultado;
    }
}
