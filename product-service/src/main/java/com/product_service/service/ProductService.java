package com.product_service.service;

import com.product_service.model.ProductModel;
import com.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductModel createProduct(ProductModel model) {

        return productRepository.save(model);
    }

    public List<ProductModel> getProducts() {

       return productRepository.findAll();
    }

    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "Product with id: " + id + " deleted";
    }

    public ProductModel updateProduct(ProductModel model, int id) {

        ProductModel existingModel = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.deleteById(id);
        existingModel.setName(model.getName());
        existingModel.setDescription(model.getDescription());
        existingModel.setPrice(model.getPrice());
        return productRepository.save(existingModel);
    }
}
