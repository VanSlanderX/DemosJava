package org.springframewok.delegatepatterndemo.controller;

import org.springframewok.delegatepatterndemo.delegate.ProductDelegate;
import org.springframewok.delegatepatterndemo.expose.ProductApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/products/v1")
public class ProductController implements ProductApi {

    private final ProductDelegate productDelegate;

    public ProductController(ProductDelegate productDelegate) {
        System.out.println("ProductController - Inicializando controller con productDelegate: " + productDelegate);
        this.productDelegate = productDelegate;
    }

    @Override
    public ProductDelegate getProductDelegate() {
        System.out.println("ProductController - getProductDelegate: " + productDelegate);
        return productDelegate;
    }

}
