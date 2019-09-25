/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteCliente;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author aryels
 */
public class CadastroCliente {
    
    ArrayList <Cliente> listaCliente = new ArrayList();
    HashMap<String, Cliente> cpfCliente = new HashMap<>();
    HashMap<String, Cliente> emailCliente = new HashMap<>();
    
    String codCliente;
    String CPF;
    String nome;
    String email;
    String senha;
    boolean x,y;
    Endereço e;
    
    public void SetCliente(String codCliente,String CPF,String nome,String email,String senha,Endereço e){
        x = ValidaCPF(CPF);
        y = ValidaEmail(email);
        
        if(x && y){
            PacoteCliente.Cliente c1 = new PacoteCliente.Cliente(codCliente, CPF, nome, email, senha,e);
            listaCliente.add(c1);
            cpfCliente.put(CPF, c1);
            emailCliente.put(email,c1);
            System.out.println("ok");
            
            
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
    if(cpfCliente.containsKey(CPF)){
       throw new IllegalStateException("CPF ja existente."); 
    }
    else{
        this.CPF = CPF;
        return true;
        
    } 

}
  
    
    public boolean ValidaEmail(String email){
     if(!email.contains("@") || !email.contains(".com")){
            System.out.println("email invalido"); 
            return false;
        }
     if( emailCliente.containsKey(email)){
         throw new IllegalStateException("email ja existente."); 
     }
        else{
           this.email = email;
            return true;
        }
 }
public void ListarClientes(){
        
        for (Cliente cliente : listaCliente) {
           cliente.ImprimeCliente();
        }
        
}

    
    
}
 
    


