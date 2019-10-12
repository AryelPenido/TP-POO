
package Model.Entidade;

import Controller.ProdutoControle;
import java.util.ArrayList;

public class Vendas {
    private String codCliente;
    private String DataInicio;
    private String Status;
    private String codVenda;
    
    private ProdutoControle prodControle;
    private ArrayList <Produto> prodven = new ArrayList<Produto>();
    private String prod;
    public Vendas(String codCliente, String DataInicio,String Status,String codVenda,ArrayList <Produto> prodven){
        
        //this.prodControle = prodControle;
        this.codCliente = codCliente;
        
        this.DataInicio = DataInicio;
        
        this.codVenda = codVenda;
        this.Status = Status;
        //this.prodven.add(prodControle.busca(id));
        this.prodven = prodven;
    }
    
    
    public void SetStatus (String Status){
        this.setStatus(Status);
    }
    
    
 
    
    public void ImprimeVenda(){
        System.out.println("codVenda: "+getCodVenda());
        System.out.println("Status:"+getStatus());
        System.out.println("DataInicio: "+getDataInicio());
        for(Produto p: getProdven()) {
            p.ImprimeProduto();
        }
        
        
    }

    public String getCodCliente() {
        return codCliente;
    }

    public String getDataInicio() {
        return DataInicio;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getCodVenda() {
        return codVenda;
    }

    public ProdutoControle getProdControle() {
        return prodControle;
    }

    public ArrayList <Produto> getProdven() {
        return prodven;
    }

    public String getProd() {
        return prod;
    }
    
}


