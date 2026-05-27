package org.springframewok.delegatepatterndemo.expose;

import org.springframewok.delegatepatterndemo.delegate.ProductDelegate;
import org.springframewok.delegatepatterndemo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductApi {

    default ProductDelegate getProductDelegate() {
        return new ProductDelegate() {};
    }

    @PostMapping(path = "/create")
    default String createNewProduct(@RequestBody Product product) {
        System.out.println("ProductApi - createNewProduct: " + product.toString());
        return getProductDelegate().createNewProduct(product);
    }

    @GetMapping(path = "/retrieve/{indice}")
    default String findProduct(@PathVariable String indice) {
        System.out.println("ProductApi - findProduct() con indice: " + indice);
        return getProductDelegate().findProduct(indice);
    }

}
