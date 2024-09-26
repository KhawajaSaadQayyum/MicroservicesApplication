package com.product_service.controller;

import com.product_service.model.ProductModel;
import com.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")


public class ProductController {

    public final ProductService productService;
    @PostMapping("/addProduct")
    public ProductModel createProduct(@RequestBody ProductModel model){
        return  productService.createProduct(model);
    }

    @GetMapping("/getProducts")

  public List<ProductModel> getProducts(){
        return productService.getProducts();
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

    @PutMapping("/update/{id}")

    public ProductModel updateProduct(@PathVariable int id, @RequestBody ProductModel model){
        return productService.updateProduct(model ,id);
    }






}
