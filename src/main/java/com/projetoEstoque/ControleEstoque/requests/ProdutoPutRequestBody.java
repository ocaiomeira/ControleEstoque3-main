package com.projetoEstoque.ControleEstoque.requests;

import lombok.Data;

@Data
public class ProdutoPutRequestBody {
    private  long id;
    private String name;
     private String descricao;
    private double preco;


}
