/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;
//import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("gestão");
        Scanner s = new Scanner(System.in);
        boolean x = false;
        String CPF;
        String CEP;
        String rua;
        int numero;
        String bairro;
        String cidade;
        String estado;
        String pais;
        //PacoteProduto.Produto p1 = new PacoteProduto.Produto("xx", "cd de musicas", 3, "eletronicos","CD");
        //PacoteProduto.Produto p2 = new PacoteProduto.Produto("xy", "chocolate branco", 2, "alimento","Doce");
        PacoteProduto.Estoque.Imprime();
        CPF = s.next();
        do{
           if(x=(PacoteCliente.Cliente.VerificaCpf(CPF))){
             PacoteCliente.Cliente c1 = new PacoteCliente.Cliente("cl1", CPF, "aryel", "aryelpenido@gmail", "25336200"); 
        }
           else{
               System.out.println("Novo CPF:");
               CPF = s.next();
           }
        
        }while( x==false);
        
       
        //PacoteCliente.Cliente c2 = new PacoteCliente.Cliente("cl1", "14416791622", "joao", "joaopenido@gmail", "25336200");
        //CPF = s.next();
        
        System.out.println("Novo endereço?");
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

        
        
    }
    
}
