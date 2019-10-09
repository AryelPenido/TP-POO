
package Controller;

import Model.Entidade.Endereço;
import Model.Entidade.Produto;
import Model.Entidade.Vendas;
import Model.Persistencia.VendasDAO;
import java.util.ArrayList;

public class VendasControle {
    
    private VendasDAO DAOvenda;
    
    public VendasControle(){
        
        DAOvenda = new VendasDAO();
}
    public void Insere(String codCliente, Endereço end, String DataInicio, String Status,String codVenda,ArrayList <Produto> prodven){
       DAOvenda.AddVendas(codCliente, end, DataInicio,Status,codVenda,prodven);
    }
    
    public void ListaTodas(){
        ArrayList <Vendas>  vendas =DAOvenda.ListarVendas();
       // ArrayList <Produto> produtos = DAOvenda.ListarVendas()
        for (Vendas v : vendas) {
           v.ImprimeVenda();
         }
    
}
}
   
