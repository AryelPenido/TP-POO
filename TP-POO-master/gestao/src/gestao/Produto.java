/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author aryels
 */
public class Produto {
    String id;
    String descricao;
    int qtd;
    String categoria;
    String tipo;
    
    public Produto(String id,String descricao,int qtd,String categoria,String tipo){
        this.id = id;
        this.descricao = descricao;
        this.qtd = qtd;
        this.categoria = categoria;
        gestao.TipoProduto t = new gestao.TipoProduto(tipo);
        adc();
        
       // TipoProduto t = new TipoProduto(tipo);
    }
    private void adc(){
     gestao.Estoque.addEstoque(this);
    }
    
   
    
    
    /*public void SetTipo(String tipo){
        if(tipo.equalsIgnoreCase("cd")){
            TipoCd();
        }
    }*/
    
   

    

}   
    
    
    

