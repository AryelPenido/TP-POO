
package Model.Persistencia;


import Controller.ClienteControle;
import Model.Entidade.Cliente;
import Model.Entidade.Endereço;
import java.util.ArrayList;
import java.util.HashMap;


public class ClienteDAO {
    
   public  ArrayList <Cliente> listaCliente = new ArrayList();
    
    
   public void ADDClienteDAO( String codCliente,String CPF,String nome,String email,String senha,Endereço e) {
    Cliente c = new Cliente( codCliente,CPF,nome,email,senha,e);
     listaCliente.add(c);
    
}

    public Cliente getCliente ( String codCliente){
        for (Cliente cliente : listaCliente){
            if (cliente.GetcodCliente().equalsIgnoreCase(codCliente)){
                return cliente;
            }
            else{
              throw new IllegalStateException("CLIENTE NÃO EXISTE"); 
            }
        }
        return null;
    }
    
    
    public void AlterarCliente(ClienteControle cc,String CPF,String alt,String dado){

    for (Cliente cliente : listaCliente) {
           if(cliente.GetCPF().equals(CPF)){
               if(alt.equalsIgnoreCase("nome")){  //alteração será do nome?
                   cliente.SetNome(dado);
                   System.out.println("nome alterado");
               }
              if(alt.equalsIgnoreCase("email")){
                   boolean x = cc.ValidaEmail(dado);
                   
                   if(x == true){
                       cliente.SetEmail(dado);
                       System.out.println("email alterado");
                   }
               }
               if(alt.equalsIgnoreCase("senha")){
                   cliente.SetSenha(dado);
                   System.out.println("senha alterada");
               }
           }
        } 
}

    
public ArrayList<Cliente> ListarClientes(){
        return listaCliente;      
}

}

    


