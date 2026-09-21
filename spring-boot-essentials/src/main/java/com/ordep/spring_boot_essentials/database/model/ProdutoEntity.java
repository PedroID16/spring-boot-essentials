package com.ordep.spring_boot_essentials.database.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@ToString 
public class ProdutoEntity {

    private int id;
    private String nome;
    private BigDecimal preco;
    private int quantidade;
}
