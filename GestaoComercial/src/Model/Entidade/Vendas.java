
package Model.Entidade;

import Controller.ProdutoControle;
import java.util.ArrayList;

public class Vendas {
    String codCliente;
    Endereço end;
    String DataInicio, Status;
    String codVenda;
    ProdutoControle prodControle;
    ArrayList <Produto> prodven = new ArrayList<Produto>();
    
    String prod;
    public Vendas(String codCliente, Endereço end,
            String DataInicio,String Status,String codVenda,ArrayList <Produto> prodven){
        
        //this.prodControle = prodControle;
        this.codCliente = codCliente;
        this.end = end;
        this.DataInicio = DataInicio;
        
        this.codVenda = codVenda;
        this.Status = Status;
        //this.prodven.add(prodControle.busca(id));
        this.prodven = prodven;
    }
    
    
    public void SetStatus (String Status){
        this.Status = Status;
    }
    
    
 
    
    public void ImprimeVenda(){
        for(Produto p: prodven) {
            p.ImprimeProduto();
        }
        end.ImprimeEndereço();
        System.out.println("DataInicio: "+DataInicio);
        System.out.println("codVenda: "+codVenda);
        System.out.println("Status:"+Status);
    }
    
}


