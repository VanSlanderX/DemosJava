package org.springframewok.delegatepatterndemo.expose;

import org.springframewok.delegatepatterndemo.delegate.ProductDelegate;
import org.springframewok.delegatepatterndemo.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductApi {

    default ProductDelegate getProductDelegate() {
        return new ProductDelegate() {};
    }

    @PostMapping(path = "/create")
    default ResponseEntity<String> createNewProduct(@RequestBody Product product) {
        System.out.println("ProductApi - Ingresando a createNewProduct con: " + product.toString());
        String resultado = getProductDelegate().createNewProduct(product);
        System.out.println("ProductApi - Se obtuvo: " + resultado);

        return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
    }

    @GetMapping(path = "/retrieve/{indice}")
    default ResponseEntity<Product> findProduct(@PathVariable String indice) {
        System.out.println("ProductApi - findProduct() con indice: " + indice);
        Product resultado = getProductDelegate().findProduct(indice);
        System.out.println("ProductApi - Se obtuvo: " + resultado.toString());

        return  ResponseEntity.ok(resultado);
    }

}
