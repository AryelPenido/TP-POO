/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;
import java.util.ArrayList;

public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("gestão");
        gestao.Produto p1 = new gestao.Produto("xx", "cd de musicas", 3, "eletronicos","CD");
        gestao.Produto p2 = new gestao.Produto("xy", "chocolate branco", 2, "alimento","Doce");
        gestao.Estoque.Imprime();
        
    }
    
}
