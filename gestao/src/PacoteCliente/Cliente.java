package PacoteCliente;
import java.util.Scanner;
import java.util.ArrayList;


public class Cliente {
    String codCliente;
    String CPF;
    String nome;
    String email;
    private String senha;
    ArrayList <Endereço> endereço = new ArrayList();
    
    public Cliente( String codCliente,String CPF,String nome,String email,String senha){
        
        this.codCliente = codCliente;
        this.nome = nome;
        this.senha = senha;
        SetCpf(CPF);
        SetEmail(email);
        SetEndereço();
    }
    public void SetNome(String nome){
        this.nome= nome;
    }
    
    public void SetCpf(String CPF){
        boolean x = false;
        Scanner s = new Scanner(System.in);
        do{
            x=VerificaCpf(CPF);
            if(x == false){
                System.out.println("Entre com CPF valido:");
                CPF = s.next();
            }
        }while(x==false);
        
    }
    
    public boolean VerificaCpf(String CPF){
     if(CPF.length()<11){
         System.out.println("CPF inválido");
         return false;
     }
     else{
         this.CPF = CPF;
         return true;
     } 
 }
    
    public void SetSenha(String senha){
        this.senha=senha;
    }
    
    public void SetEmail(String email){
       boolean x = false;
       Scanner s = new Scanner(System.in);
       do{
            x = VerificaEmail(email); 
            if(x == false){
                System.out.println("Entre com um email valido");
                email = s.next();
            }
        }while(x == false);
      
        
    }
    
public boolean VerificaEmail(String email){
     if(!email.contains("@") || !email.contains(".com")){
            System.out.println("email invalido");
            return false;
        }
        else{
            this.email = email;
            return true;
        }
}

public void SetEndereço(){
    Scanner s = new Scanner(System.in);
    String CEP;
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;
    String pais;
    //System.out.println("Novo endereço?");
    System.out.println("pais:");
    pais = s.next();
    System.out.println("estado:");
    estado = s.next();
    System.out.println("cidade:");
    cidade = s.next();
     System.out.print("bairro:");
    bairro = s.next();
    System.out.print("rua:");
    rua = s.next();
    System.out.print("CEP:");
    CEP = s.next();
    System.out.print("numero:");
    numero = s.nextInt();
    PacoteCliente.Endereço e1 = new PacoteCliente.Endereço(CEP, rua, numero, bairro, cidade, estado, pais);
    endereço.add(e1);
}

}