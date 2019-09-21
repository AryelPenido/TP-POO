/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;

/**
 *
 * @author aryels
 */
public class Produto {
    String id;
    String descricao;
    int qtd;
    String categoria;
    //classe tipo
    
    public Produto(String id,String descricao,int qtd,String categoria){
        this.id = id;
        this.descricao = descricao;
        this.qtd = qtd;
        this.categoria = categoria;
        gestao.Estoque.addEstoque(this);
    }
    
    
    
    
    
    
}
