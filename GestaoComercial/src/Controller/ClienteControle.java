
package Controller;

import Model.Entidade.Cliente;
import Model.Entidade.Endereço;
import Model.Persistencia.ClienteDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteControle {
   
    ClienteDAO cd ;
    boolean x,y;
    
    public ClienteControle(){
        cd = new ClienteDAO();
    }
    
    
    
    public void AlterarClienteControle(ClienteControle cc,String CPF,String alt,String dado){
        cd.AlterarCliente(cc, CPF, alt, dado);
    }
    
    
    /*public void SetEndereço(String CPF,String CEP,String rua,int numero,String bairro,String cidade,String estado,String pais){
        Endereço e = new Endereço(CEP,rua,numero,bairro,cidade,estado,pais);
        ArrayList<Cliente>  cliente = cd.ListarClientes();
        for (Cliente c : cliente) {
            if(c.GetCPF().equals(CPF)){
               c.SetEndereço(e);
            }
    }
    }*/
    
    public boolean SetCliente(String codCliente,String CPF,String nome,String email,String senha, String CEP,String numero,String Rua,String Bairro,String Cidade, String Estado, String Pais){
        x = ValidaCPF(CPF);
        y = ValidaEmail(email);
        
        if(x && y){
  
            cd.ADDClienteDAO( codCliente,CPF,nome,email,senha,CEP,numero,Rua,Bairro,Cidade,Estado,Pais);
            return true;
        }
        else{
            System.out.println("Impossivel efetuar cadastro, tente novamente");
        }
        
        
        return false;
    }
 
    public boolean  ValidaCPF(String CPF){
       
    if(CPF.length()<11 ){//verifica se o numero digitado pode ser um cpf e se ele já não existe;
        System.out.println("CPF inválido");
        JOptionPane.showMessageDialog(null,"CPF invalido");
        return false;
    }
    for (Cliente cliente : cd.listaCliente) {
       if(cliente.GetCPF().equalsIgnoreCase(CPF)){
           JOptionPane.showMessageDialog(null,"CPf ja existente");
           throw new IllegalStateException("CPF ja existente."); 
       }
    }
    return true;
    }
    
    public boolean ValidaEmail(String email){
     if(!email.contains("@") || !email.contains(".com")){
            //System.out.println("email invalido"); 
            JOptionPane.showMessageDialog(null,"email invalido");
            return false;
        }
     for(Cliente cliente : cd.listaCliente) {
       if(cliente.GetEmail().equalsIgnoreCase(email)){
           JOptionPane.showMessageDialog(null,"Email ja existente");
           throw new IllegalStateException("Email ja existente."); 
           
       }
    }
    return true;
    }
 

public void ListaClienteControle(){
   ArrayList<Cliente>  cliente = cd.ListarClientes();
   for (Cliente c : cliente) {
             c.ImprimeCliente();
   }
   
}

public void ListarClienteControle(String nome){
    ArrayList<Cliente> cliente = cd.ListarClientes();
    for(Cliente c: cliente){
        if(c.Getnome().equalsIgnoreCase(nome)){
            c.ImprimeCliente();
        }
    }
}
  

}

