package PacoteCliente;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;

public class Cliente {
    String codCliente;
    String CPF;
    String nome;
    String email;
    private String senha;
    ArrayList <Endereço> endereço = new ArrayList<>();
    
    public Cliente( String codCliente,String CPF,String nome,String email,String senha){
        
        this.codCliente = codCliente;
        this.nome = nome;
        this.senha = senha;
        this.CPF = CPF;
        this.email = email;
    }
    
    public void SetNome(String nome){
        this.nome= nome;
    }
    
    public void SetcodCliente(String codCleinte){
        this.codCliente = codCliente;
    }
    
    public void SetSenha(String senha){
        this.senha = senha;
    }
    
    
    public void SetCpf(String CPF){
        this.CPF = CPF;
        
    }
    
     
    public void SetEmail(String email){
       this.email = email;    
    }
    


/*public void AdcEndereço(){
    endereço.add(PacoteClienteGetEndereço());
}*/

}
