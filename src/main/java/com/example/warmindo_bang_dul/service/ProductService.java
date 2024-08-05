package com.example.warmindo_bang_dul.service;

import com.example.warmindo_bang_dul.dto.GetProductResponseDto;
import com.example.warmindo_bang_dul.dto.ProductCreateRequestDto;
import com.example.warmindo_bang_dul.model.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<GetProductResponseDto> getAllProduct();
    Product create(ProductCreateRequestDto productCreateRequestDto);
    Product getById(UUID productId);
}
