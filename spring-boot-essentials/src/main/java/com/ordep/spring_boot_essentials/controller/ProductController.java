package com.ordep.spring_boot_essentials.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ordep.spring_boot_essentials.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping("/v1/products")
@RequiredArgsConstructor 
public class ProductController {


    private final ProductService productService;

    @GetMapping
    public String findAll(){
        productService.findAll();
        return "Products retrieved successfully!";
    }

}
