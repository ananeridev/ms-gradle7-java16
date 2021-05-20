package com.anabneri.gradlejava16test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductRepository repository;

    public ProductController(final ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Product> findAll() {
        return repository.findAll();
    }

}
