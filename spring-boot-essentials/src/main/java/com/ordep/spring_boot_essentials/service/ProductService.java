package com.ordep.spring_boot_essentials.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ordep.spring_boot_essentials.database.model.ProdutoEntity;

@Service
public class ProductService {
	private static final ProdutoEntity produto1 = new ProdutoEntity(1, "Produto 1", new BigDecimal("10.99"), 5);
	private static final ProdutoEntity produto2 = new ProdutoEntity(2, "Produto 2", new BigDecimal("19.99"), 3);
	private static final List<ProdutoEntity> PRODUTOS = List.of(produto1, produto2);


public List<ProdutoEntity> findAll() {
	return new ArrayList<>(PRODUTOS);

}
}
