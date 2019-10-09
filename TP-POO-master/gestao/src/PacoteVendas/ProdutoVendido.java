/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteVendas;

/**
 *
 * @author hillison
 */
public class ProdutoVendido {
    PacoteProduto.Produto prod;
    int qtde;
    double valor ;
    
    public ProdutoVendido(PacoteProduto.Produto prod,int qtde){
        this.prod = prod;
        this.qtde = qtde;
        this.valor = qtde * prod.GetPreco();
    }
     public void ImprimeListaProd(){
         System.out.println(prod);
         System.out.println(qtde);
         System.out.println(prod.GetPreco());
     }
    
}
