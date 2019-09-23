package PacoteCliente;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;

public class Cliente {
    String codCliente;
    String CPF;
    String nome;
    static String email;
    private String senha;
    ArrayList <Cliente> listaCliente = new ArrayList();
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
    
     
    public static void SetEmail(String email){
       Cliente.email = email;    
    }
    
public void VerificaEmail(String email){
     if(!email.contains("@") || !email.contains(".com")){
            System.out.println("email invalido");
   
        }
        else{
            SetEmail(email);
        }
 }
 
    public  void  VerificaCpf(String CPF){
    if(CPF.length()<11){
        System.out.println("CPF inválido");
        
    }
    else{
        SetCpf(CPF);
        
    } 
}

/*public void AdcEndereço(){
    endereço.add(PacoteClienteGetEndereço());
}*/

}
