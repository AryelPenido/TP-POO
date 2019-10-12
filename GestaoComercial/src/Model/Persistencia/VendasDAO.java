
package Model.Persistencia;
import Controller.ProdutoControle;
import Model.Entidade.Cliente;
import Model.Entidade.Produto;
import Model.Entidade.Vendas;
import java.util.ArrayList;

public class VendasDAO {
    private final ArrayList <Vendas> historico;
    
    public VendasDAO(){
        System.out.println("vendas DAO");
        historico = new ArrayList<Vendas>();
    }
    

    public void AddVendas (String codCliente, String DataInicio, String Status,String codVenda,ArrayList <Produto> prodven){
        Vendas venda = new Vendas(codCliente,DataInicio,Status,codVenda,prodven);
        //venda.ImprimeVenda();
        historico.add(venda);
        
    }


    public ArrayList<Vendas> ListarVendas(){
        return historico;
    }
    
    
    
}