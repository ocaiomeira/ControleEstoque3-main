package com.projetoEstoque.ControleEstoque.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ProdutoPostRequestBody {
    @NotEmpty(message="O nome não pode estar vazio")
    @NotNull(message="O nome não pode estar nulo")
    private String name;
    private String descricao;
    @NotEmpty(message="O valor do produto não pode estar vazio")
    private double preco;

}
