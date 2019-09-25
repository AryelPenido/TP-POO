/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteProduto;
import PacoteProduto.Produto;
import java.util.ArrayList;
public class Estoque {
    
   static ArrayList <Produto> produtos = new ArrayList() ;
   static ArrayList qtdestoque = new ArrayList();
   static ArrayList<TipoProduto> tpo = new ArrayList();
   
   protected static void addEstoque(PacoteProduto.Produto p){
       produtos.add(p);
       qtdestoque.add(p.qtd);
      //addTipoaEstoque()
   }
   
  /* protected static void addTipoaEstoque(PacoteProduto.TipoProduto tp){
       tpo.add(tp);
   }*/
   
  public static void Imprime(){//mover pra gestão?
      
      System.out.println("produtos cadastrados:");
      for(int i =0;i<Estoque.produtos.size(); i++){
          System.out.println("id:"+Estoque.produtos.get(i).id);
          System.out.println("descrição:"+Estoque.produtos.get(i).descricao);
          System.out.println("categoria:"+Estoque.produtos.get(i).categoria);
          System.out.println("Tipo:"+Estoque.produtos.get(i).tipo);
          System.out.println("quantidade:"+Estoque.qtdestoque.get(i));
          System.out.println("");
      }
  }
  
   
   
   public ArrayList Get_produtoscadastrados(){
       return produtos;
   }
   
   
   public void ListarProdutos(){
        System.out.println("Lista de produtos");
        for (Produto prod : produtos) {
           prod.ImprimeProduto();
        }
       
}
}
