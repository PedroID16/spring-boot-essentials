package com.ordep.spring_boot_essentials.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ordep.spring_boot_essentials.Dto.ProdutoDto;
import com.ordep.spring_boot_essentials.database.model.ProdutoEntity;
import com.ordep.spring_boot_essentials.exception.NotFoundException;
import com.ordep.spring_boot_essentials.service.ProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
@RequestMapping("/v1/products")
@RequiredArgsConstructor 
public class ProductController {


    private final ProductService productService;

    @GetMapping
    public List<ProdutoEntity> findAll(){
       return productService.findAll();
    }

    
    @PostMapping
    public ProdutoEntity createProduct(@RequestBody ProdutoDto produtoDto) {
        return productService.createProduct(produtoDto);
    }


    @PutMapping("/{id}")
    public String putMethodName(@PathVariable Integer id, @RequestBody ProdutoDto produtoDto) throws NotFoundException {      
        return productService.atualizarProduto(id, produtoDto).toString();
    }

    @DeleteMapping("/{id}")
    public ProdutoEntity deleteMethodName(@PathVariable Integer id) {
        return productService.deletarProduto(id);
    }
    
}
