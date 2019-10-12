
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
    public void Insere(String codCliente, String DataInicio, String Status,String codVenda,ArrayList <Produto> prodven){
       DAOvenda.AddVendas(codCliente, DataInicio,Status,codVenda,prodven);
    }
    
    public ArrayList <Vendas> ListaTodas(){
        ArrayList <Vendas>  vendas =DAOvenda.ListarVendas();
        return vendas;
    
    }
    
    
}
   
