/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aryels
 */
public class TipoProduto {
    
    ArrayList tipo = new ArrayList();
        
    
   
    public TipoProduto(String t){
       tipo.add(t);
       if(t.equalsIgnoreCase("Cd")){
       TipoCd(tipo);
       }
   }
    
    
    private  void TipoCd(ArrayList tipo){
        Scanner s = new Scanner(System.in);
        String gravação;
        int anoLançamento;
        String artista;
        System.out.println("Tipo cd");
        System.out.println("Gravado?");
        gravação = s.next();
        if(gravação.equalsIgnoreCase("sim")){
            System.out.println("Nome do artista:");
            artista = s.next();
            tipo.add(artista);
            System.out.println("ano de lançamento");
            anoLançamento = s.nextInt();
            tipo.add(anoLançamento);
        }
     
}
    
    
  public void Imprimetipo(){
      
  }
}
    

