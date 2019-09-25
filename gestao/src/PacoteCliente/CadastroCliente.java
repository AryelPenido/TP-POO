
package PacoteCliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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


public void AlterarCliente(String CPF,String alt,String dado){
    boolean x;
    for (Cliente cliente : listaCliente) {
           if(cliente.GetCPF().equals(CPF)){
               if(alt.equalsIgnoreCase("nome")){
                   cliente.SetNome(dado);
                   System.out.println("nome alterado");
               }
               if(alt.equalsIgnoreCase("email")){
                   x = ValidaEmail(dado);
                   
                   if(x == true){
                       cliente.SetEmail(dado);
                       System.out.println("email alterado");
                   }
               }
               if(alt.equalsIgnoreCase("senha")){
                   cliente.SetSenha(senha);
                   System.out.println("senha alterada");
               }
           }
        } 
}

    
    
}
 
    


