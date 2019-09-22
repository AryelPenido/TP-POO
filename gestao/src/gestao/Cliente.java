/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;
import java.util.Scanner;
/**
 *
 * @author aryels
 */
public class Cliente {
    String codCliente;
    String CPF;
    String nome;
    String email;
    String senha;
    //endereço;
    
    
    
    public Cliente( String codCliente,String CPF,String nome,String email,String senha){
        boolean x = false;
        Scanner s = new Scanner(System.in);
        this.codCliente = codCliente;
        this.CPF = CPF;
        this.nome = nome;
        this.senha = senha;
        do{
            x = SetEmail(email); 
            if(x == false){
                System.out.println("Entre com um email valido");
                email = s.next();
            }
        }while(x == false);
      
       
        
    }
    
    public void SetCpf(String CPF){
        
        
    }
    
    public boolean SetEmail(String email){
        if(!email.contains("@") || !email.contains(".com")){
            System.out.println("email invalido");
            return false;
        }
        else{
            this.email = email;
            return true;
        }
        
    }
}
