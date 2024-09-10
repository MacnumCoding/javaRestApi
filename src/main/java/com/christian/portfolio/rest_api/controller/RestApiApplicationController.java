package com.christian.portfolio.rest_api.controller;

import com.christian.portfolio.rest_api.model.Product;
import com.christian.portfolio.rest_api.controller.model.ProductID;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.tomcat.util.json.JSONFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiApplicationController {
    @PostMapping("/product")
    public ResponseEntity<ProductID> createProduct(@RequestBody final Product product) {
        ProductID result = new ProductID(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED)
            .contentType(MediaType.APPLICATION_JSON)
            .body(result);
    }

    @GetMapping("product")
    public List<Product> getAllProducts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product("1", "Product1", new BigDecimal("258.33")));
        result.add(new Product("2", "Product2", new BigDecimal("11.32")));
        result.add(new Product("3", "Product3", new BigDecimal("55.91")));
        return result;
    }

    @GetMapping("product/{id}")
    public Product getProductById(@PathVariable final String id) {
        System.out.println(id);
        return new Product("888", "Returning a single product", new BigDecimal("4444.333"));
    }

    @PatchMapping("product")
    public void patchProduct(@RequestBody final Product product) {
        System.out.println(product);

    }

    @DeleteMapping("product/{id}")
    public void deleteProduct(@PathVariable final String id) {
        System.out.println(id);

    }
}
