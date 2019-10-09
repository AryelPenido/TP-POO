
package Controller;

import Model.Entidade.Cliente;
import Model.Entidade.Endereço;
import Model.Persistencia.ClienteDAO;
import java.util.ArrayList;

public class ClienteControle {
   
    ClienteDAO cd ;
    boolean x,y;
    
    public ClienteControle(){
        cd = new ClienteDAO();
    }
    
    
    
    
    public void SetCliente(String codCliente,String CPF,String nome,String email,String senha,Endereço e){
        x = ValidaCPF(CPF);
        y = ValidaEmail(email);
        
        if(x && y){
  
            cd.ADDClienteDAO(codCliente, CPF, nome, email, senha, e);
    
        }
        else{
            System.out.println("Impossivel efetuar cadastro, tente novamente");
        }

    }
 
    public boolean  ValidaCPF(String CPF){
       
    if(CPF.length()<11 ){//verifica se o numero digitado pode ser um cpf e se ele já não existe;
        System.out.println("CPF inválido");
        return false;
    }
    for (Cliente cliente : cd.listaCliente) {
       if(cliente.GetCPF().equalsIgnoreCase(CPF)){
         
           throw new IllegalStateException("CPF ja existente."); 
       }
    }
    return true;
    }
    
    public boolean ValidaEmail(String email){
     if(!email.contains("@") || !email.contains(".com")){
            System.out.println("email invalido"); 
            return false;
        }
     for(Cliente cliente : cd.listaCliente) {
       if(cliente.GetEmail().equalsIgnoreCase(email)){
           throw new IllegalStateException("CPF ja existente."); 
       }
    }
    return true;
    }
 

public void ListaClienteControle(){
   ArrayList<Cliente>  cliente = cd.ListarClientes();
   for (Cliente c : cliente) {
             c.ImprimeCliente();
   }
    System.out.println("aqui");
}
  

}

