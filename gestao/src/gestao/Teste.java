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
        String CPF,alt,dado;
        PacoteVendas.ListagemVendas hist = new PacoteVendas.ListagemVendas();
        PacoteProduto.Estoque ee = new PacoteProduto.Estoque();
        PacoteProduto.Produto p1 = new PacoteProduto.Produto("xx", "cd de musicas", 3, 3.50, "eletronicos","CD");
        PacoteProduto.Produto p2 = new PacoteProduto.Produto("xy", "DVD de filmes", 2, 10.00, "eletronicos","dvd");
        ee.addEstoque(p1);
        ee.addEstoque(p2);
        ee.ListarProdutos();
        ee.AlterarEstoque("xy", 5);
        
        //ee.ListarProdutos();
        PacoteCliente.Endereço e1 = new PacoteCliente.Endereço("32280360", "rio grande", 601, "novo riacho", "contagem", "MG", "Brasil");
        PacoteCliente.Endereço e2 = new PacoteCliente.Endereço("32280360", "rio grande", 602, "novo riacho", "contagem", "MG", "Brasil");
      
        PacoteCliente.CadastroCliente cc = new PacoteCliente.CadastroCliente();
        cc.SetCliente("cl1", "14416791622", "joao", "joaopenido@gmail.com", "25336200",e1);
        cc.SetCliente("666", "14416791623", "aryel", "aryelpenido@gmail.com", "25336200",e2);
        cc.ListarClientes();
        //System.out.println("qual CPF do cliente que deseja alterar?");
        //CPF = s.next();
        //System.out.println("o que será alterado?");
        //alt= s.next();
        //System.out.println("dado:");
        //dado = s.next();
        //cc.AlterarCliente(CPF, alt,dado);
        PacoteVendas.Vendas v2= new PacoteVendas.Vendas(cc.getCliente("666"), e1 , "27/10/19");
        PacoteVendas.Vendas v1= new PacoteVendas.Vendas(cc.getCliente("cl1"), e1 , "26/10/19");
        PacoteVendas.Vendas v3= new PacoteVendas.Vendas(cc.getCliente("666"), e2 , "28/10/19");
        hist.AddListagemVendas(v1);
        hist.AddListagemVendas(v2);
        hist.ImprimeHistorico();

    }
    
}
