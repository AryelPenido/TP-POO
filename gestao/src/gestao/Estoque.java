/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;
import java.util.ArrayList;
public class Estoque {
    
   static ArrayList <Produto> produtos = new ArrayList() ;
   static ArrayList qtdestoque = new ArrayList();
   
   protected static void addEstoque(gestao.Produto p){
       produtos.add(p);
       qtdestoque.add(p.qtd);
   }
   
  public static void Imprime(){
      System.out.println("produtos cadastrados:");
      for(int i =0;i<Estoque.produtos.size(); i++){
          System.out.println("id:"+Estoque.produtos.get(i).id);
          System.out.println("descrição:"+Estoque.produtos.get(i).descricao);
          System.out.println("categoria:"+Estoque.produtos.get(i).categoria);
          System.out.println("quantidade:"+Estoque.qtdestoque.get(i));
          System.out.println("");
      }
  }
   
   
   public ArrayList Get_produtoscadastrados(){
       return produtos;
   }
    
    
    
}
