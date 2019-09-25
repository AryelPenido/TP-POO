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
    ArrayList <TipoProduto> tp = new ArrayList<>();
    
    public Produto(String id,String descricao,int qtd,String categoria,String tipo){
        this.id = id;
        this.descricao = descricao;
        this.qtd = qtd;
        this.categoria = categoria;
        PacoteProduto.TipoProduto t = new PacoteProduto.TipoProduto(tipo);
        tp.add(t);
       // adc();
        
       // TipoProduto t = new TipoProduto(tipo);
    }
    
    
    public String  Getid(){
        return id;
    }
    
    public void SetQtd(int qtd){
        this.qtd = qtd;
    }
    
   /* public static void adc(){
     PacoteProduto.Estoque.addEstoque(this);
    }*/
    
   public void ImprimeProduto(){
       System.out.println("Caracteristicas produto");
       System.out.println("idproduto: "+id);
       System.out.println("descricao: "+descricao);
       System.out.println("qtd: "+qtd);
       System.out.println("categoria: "+categoria);
       for (TipoProduto tpp : tp) {
               tpp.Imprimetipo();
            }
   }
    
    
    /*public void SetTipo(String tipo){
        if(tipo.equalsIgnoreCase("cd")){
            TipoCd();
        }
    }*/
    
   

    

}   
    
    
    

