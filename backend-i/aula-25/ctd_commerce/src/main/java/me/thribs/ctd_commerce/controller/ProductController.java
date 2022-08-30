package me.thribs.ctd_commerce.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.thribs.ctd_commerce.model.Product;
import me.thribs.ctd_commerce.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productsService;

    @PostMapping
    public void addProduct(@RequestBody Product product) throws SQLException {
        productsService.add(product);
    }

    @GetMapping
    public Product getAllProduct(@RequestParam("id") int id) throws SQLException {
        return productsService.getById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Product> getProducts() throws SQLException {
        return productsService.getAll();
    }

    @PatchMapping
    public void updateProduct(@RequestParam("id") int id, @RequestParam("product") Product product) throws SQLException {
        productsService.update(id, product);
    }

    @DeleteMapping
    public void removeProduct(@RequestParam("id") int id) throws SQLException {
        productsService.remove(id);
    }

        
}
