package com.ordep.spring_boot_essentials.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ordep.spring_boot_essentials.Dto.ProdutoDto;
import com.ordep.spring_boot_essentials.database.model.ProdutoEntity;
import com.ordep.spring_boot_essentials.exception.NotFoundException;

@Service
public class ProductService {



	private static final List<ProdutoEntity> PRODUTOS = new ArrayList<>();

	static {
		PRODUTOS.add(new ProdutoEntity(1, "Produto 1", new BigDecimal("10.99"), 5));
		PRODUTOS.add(new ProdutoEntity(2, "Produto 2", new BigDecimal("19.99"), 3));
		PRODUTOS.add(new ProdutoEntity(3, "Produto 3", new BigDecimal("5.99"), 10));
	}


public List<ProdutoEntity> findAll() {
	return new ArrayList<>(PRODUTOS);

}

public ProdutoEntity createProduct(ProdutoDto produtoDto) {
	// Simulate product creation by adding it to the list
	Integer identificador = PRODUTOS.stream()
	.mapToInt(ProdutoEntity::getId)
	.max()
	.orElse(0) + 1;

	
	ProdutoEntity novoProduto = ProdutoEntity.builder()
			.id(identificador)
			.nome(produtoDto.getNome())
			.preco(produtoDto.getPreco())
			.quantidade(produtoDto.getQuantidade())
			.build();

			 PRODUTOS.add(novoProduto);

			return novoProduto;


}

public ProdutoEntity atualizarProduto(Integer id, ProdutoDto produtoDto) throws NotFoundException {
	ProdutoEntity produto = PRODUTOS.stream()
			.filter(p -> p.getId() == id)
			.findAny()
			.orElseThrow(() -> new NotFoundException("Produto não encontrado"));

			produto.setNome(produtoDto.getNome());
			produto.setPreco(produtoDto.getPreco());
			produto.setQuantidade(produtoDto.getQuantidade());

			return produto;


}


public ProdutoEntity deletarProduto(Integer id) {
	ProdutoEntity produto = PRODUTOS.stream()
			.filter(p -> p.getId() == id)
			.findAny()
			.orElseThrow(() -> new RuntimeException("Produto não encontrado"));

			PRODUTOS.remove(produto);

			return produto;



}
}