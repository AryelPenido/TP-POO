
package PacoteProduto;
import PacoteProduto.Produto;
import java.util.ArrayList;
public class Estoque {
    
   static ArrayList <Produto> produtos = new ArrayList() ;
   //static ArrayList qtdestoque = new ArrayList();
   static ArrayList<TipoProduto> tpo = new ArrayList();
   
    public void addEstoque(PacoteProduto.Produto p){
       produtos.add(p);
       
       
   }
   
    public void AlterarEstoque(String id, int qtd){
        for (Produto prod : produtos) {
            if(prod.Getid().equals(id)){
              prod.SetQtd(qtd);
            }
        }
     
    }
   
   public void ListarProdutos(){
        System.out.println("Lista de produtos");
        for (Produto prod : produtos) {
           prod.ImprimeProduto();
           
        }
    }
}
