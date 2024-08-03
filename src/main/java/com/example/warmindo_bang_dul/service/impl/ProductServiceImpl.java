package com.example.warmindo_bang_dul.service.impl;

import com.example.warmindo_bang_dul.dto.GetProductResponseDto;
import com.example.warmindo_bang_dul.dto.ProductCreateRequestDto;
import com.example.warmindo_bang_dul.model.entity.Product;
import com.example.warmindo_bang_dul.model.enums.ProductType;
import com.example.warmindo_bang_dul.repository.ProductRepository;
import com.example.warmindo_bang_dul.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<GetProductResponseDto> getAllProduct() {
        List<Product> productList = productRepository.findAll();
        return productList.stream()
                .map(product -> {
                    GetProductResponseDto responseDto = new GetProductResponseDto();
                    responseDto.setProductName(product.getProductName());
                    responseDto.setPrice(product.getPrice());
                    responseDto.setProductImage(product.getProductImage());
                    return responseDto;
                }).toList();

//        List<GetProductResponseDto> responseList = new ArrayList<>();
//
//        for (Product product : productList) {
//            GetProductResponseDto responseDto = new GetProductResponseDto();
//            responseDto.setProductName(product.getProductName());
//            responseDto.setPrice(product.getPrice());
//            responseDto.setProductImage(product.getProductImage());
//
//            responseList.add(responseDto);
//        }
//
//        return responseList;
    }

    @Override
    public Product create(ProductCreateRequestDto productCreateRequestDto) {
        Product product = new Product();
        product.setProductName(productCreateRequestDto.getProductName());
        product.setPrice(productCreateRequestDto.getPrice());
        product.setProductImage(productCreateRequestDto.getProductImage());

        if ("FOOD".equalsIgnoreCase(productCreateRequestDto.getProductType())){
            product.setProductType(ProductType.FOOD);
        } else if ("DRINK".equalsIgnoreCase(productCreateRequestDto.getProductType())) {
            product.setProductType(ProductType.DRINK);
        } else if ("SNACK".equalsIgnoreCase(productCreateRequestDto.getProductType())) {
            product.setProductType(ProductType.SNACK);
        }
        return productRepository.save(product);
    }
}
