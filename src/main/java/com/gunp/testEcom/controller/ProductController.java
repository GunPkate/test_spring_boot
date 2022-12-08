package com.gunp.testEcom.controller;

import com.gunp.testEcom.repo.ProductRepo;
import com.gunp.testEcom.model.ProductResponse;
import com.gunp.testEcom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    ProductRepo productRepo;

    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable Long id){
        return ResponseEntity.ok().body(new Product("Jackfruit","Fruit"));
    }

    @GetMapping("")
    public  ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.ok().body(productRepo.findAll());
    }
    @PostMapping
    public ResponseEntity<ProductResponse> saveProduct(@RequestBody Product productInput){
        try {
            return ResponseEntity.ok().body(new ProductResponse("200","success"));
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(new ProductResponse("400",e.getMessage()));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> updateProduct(){
        return ResponseEntity.ok().body(new ProductResponse("200","success"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductResponse> deleteProduct(){
        return ResponseEntity.ok().body(new ProductResponse("200","success"));
    }
}
