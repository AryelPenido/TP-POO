/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteProduto;
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
        PacoteProduto.TipoProduto t = new PacoteProduto.TipoProduto(tipo);
        adc();
        
       // TipoProduto t = new TipoProduto(tipo);
    }
    
    public void adc(){
     PacoteProduto.Estoque.addEstoque(this);
    }
    
   public void ImprimeProduto(){
       System.out.println("idproduto: "+id);
       System.out.println("descricao: "+descricao);
       System.out.println("qtd: "+qtd);
       System.out.println("categoria: "+categoria);
       
   }
    
    
    /*public void SetTipo(String tipo){
        if(tipo.equalsIgnoreCase("cd")){
            TipoCd();
        }
    }*/
    
   

    

}   
    
    
    

