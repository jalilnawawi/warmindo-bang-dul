package com.example.warmindo_bang_dul.model.entity;

import com.example.warmindo_bang_dul.model.enums.ProductType;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.UUID;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Product extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private UUID productId;

    @Column(name = "product_name")
    private String productName;

    private Double price;

    @Column(name = "product_image")
    private String productImage;

    @Column(name = "product_type")
    private ProductType productType;
}
