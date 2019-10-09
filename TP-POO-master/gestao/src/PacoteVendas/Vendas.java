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
public class Vendas {
    PacoteCliente.Cliente client;
    PacoteCliente.Endereço end;
    String Data, Status;
    ArrayList <PacoteProduto.Produto> lista = new ArrayList();
    
    public Vendas( PacoteCliente.Cliente client , PacoteCliente.Endereço end , String Data ){
        this.client = client;
        this.end = end;
        this.Data = Data;
        this.Status = "Pendente";
        System.out.println(Status);
        
        
    }
    
    public void SetStatus (String Status){
        this.Status = Status;
    }
    
    public void ImprimeVenda(){
        client.ImprimeClienteVenda();
        end.ImprimeEndereço();
        System.out.println("Data:"+Data+" Status:"+Status);
        for (PacoteProduto.Produto prod : lista){
            prod.ImprimeListaProd();
        }
    }

}
