/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteVendas;
import java.util.ArrayList;
/**
 *
 * @author hillison
 */
public class ListagemVendas {
    static ArrayList <Vendas> historico = new ArrayList();
    
    public void AddListagemVendas (Vendas venda){
        historico.add(venda);
        
    }
    
    public void ImprimeHistorico(){
        for (Vendas l: historico){
            l.ImprimeVenda();
        }
    }
}
