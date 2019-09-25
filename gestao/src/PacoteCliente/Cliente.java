package PacoteCliente;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;

public class Cliente {
    private String codCliente;
    private String CPF;
    private String nome;
    private String email;
    private String senha;
    ArrayList <Endereço> endereço = new ArrayList<>();
    
    public Cliente( String codCliente,String CPF,String nome,String email,String senha,Endereço e){
        
        this.codCliente = codCliente;
        this.nome = nome;
        this.senha = senha;
        this.CPF = CPF;
        this.email = email;
        endereço.add(e);
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
    
    
public void AdcEndereço(Endereço e){
    endereço.add(e);
}


public void ImprimeCliente(){
      System.out.println("");
      System.out.println("codCliente: "+codCliente);
      System.out.println("nome: "+nome);
      System.out.println("CPF: "+CPF);
      System.out.println("email: "+email);
      System.out.println("\nENDEREÇO");
      for (Endereço end : endereço) {
           end.ImprimeEndereço();
        }
        
  }




}
