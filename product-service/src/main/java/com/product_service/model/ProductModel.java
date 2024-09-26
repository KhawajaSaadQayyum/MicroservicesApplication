package com.product_service.model;

import java.math.BigDecimal;
import jakarta.persistence.*;  // For JPA annotations
import lombok.*;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor



public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
}
