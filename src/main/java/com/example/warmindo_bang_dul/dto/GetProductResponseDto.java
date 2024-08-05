package com.example.warmindo_bang_dul.dto;

import lombok.Data;

@Data
public class GetProductResponseDto {
    private String productName;
    private Double price;
    private String productImage;
    private String productType;
}
