package com.example.warmindo_bang_dul.dto;

import com.example.warmindo_bang_dul.model.enums.ProductType;
import lombok.Data;

@Data
public class ProductCreateRequestDto {
    private String productName;
    private Double price;
    private String productImage;
    private String productType;
}
