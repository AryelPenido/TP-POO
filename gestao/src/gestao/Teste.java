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
        
        //PacoteProduto.Produto p1 = new PacoteProduto.Produto("xx", "cd de musicas", 3, "eletronicos","CD");
        //PacoteProduto.Produto p2 = new PacoteProduto.Produto("xy", "chocolate branco", 2, "alimento","Doce");
       
        PacoteCliente.Endereço e1 = new PacoteCliente.Endereço("32280360", "rio grande", 601, "novo riacho", "contagem", "MG", "Brasil");
        PacoteCliente.CadastroCliente cc = new PacoteCliente.CadastroCliente();
        cc.SetCliente("cl1", "14416791622", "joao", "joaopenido@gmail.com", "25336200",e1);
        cc.SetCliente("cl2", "14416791623", "aryel", "aryelpenido@gmail.com", "25336200",e1);
        cc.ListarClientes();
        
        
        
        
    }
    
}
