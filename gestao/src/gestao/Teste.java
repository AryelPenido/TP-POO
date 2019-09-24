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
        
        PacoteCliente.CadastroCliente cc = new PacoteCliente.CadastroCliente();
        cc.SetCliente("cl1", "14416791622", "joao", "joaopenido@gmail.com", "25336200");
        cc.SetCliente("cl2", "14416791622", "aryel", "joaopenido@gmail.com", "25336200");
       
        //PacoteCliente.Cliente c2 = new PacoteCliente.Cliente("cl1", "14416791622", "joao", "joaopenido@gmail", "25336200");
        //CPF = s.next();
        
        /*System.out.println("Novo endereço?");
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
        */
        
        
    }
    
}
