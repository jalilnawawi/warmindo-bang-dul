package com.example.warmindo_bang_dul.controller;

import com.example.warmindo_bang_dul.dto.ProductCreateRequestDto;
import com.example.warmindo_bang_dul.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> create(@RequestBody ProductCreateRequestDto productCreateRequestDto){
        Map<String, Object> response = new HashMap<>();
        response.put("message", "success");
        response.put("data", productService.create(productCreateRequestDto));

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> getAll(){
        Map<String, Object> response = new HashMap<>();
        response.put("message", "success get product");
        response.put("data", productService.getAllProduct());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable("id") UUID productId){
        Map<String, Object> response = new HashMap<>();
        response.put("message", "success");
        response.put("data", productService.getById(productId));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
