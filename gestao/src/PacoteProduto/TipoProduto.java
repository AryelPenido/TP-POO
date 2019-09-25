
package PacoteProduto;

import java.util.ArrayList;
import java.util.Scanner;


public class TipoProduto {
    
    static ArrayList tipo = new ArrayList();
        
    
   
    public TipoProduto(String t){
       //tipo.add(t);
       if(t.equalsIgnoreCase("Cd")){
       TipoCd(tipo);
       }
       if(t.equalsIgnoreCase("doce")){
           TipoDoce(tipo);
       }
   }
    
    //fazer mais tipo de exemplo;
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
        //Imprimetipo();
     
}
    private void TipoDoce( ArrayList tipo){
        Scanner s = new Scanner(System.in);
        int calorias;
        String data;
        System.out.println("Tipo doce:");
        System.out.println("calorias?");
        calorias = s.nextInt();
        tipo.add(calorias);
        System.out.println("Data de validade");
        data = s.next();
        tipo.add(data);
        //Imprimetipo();
    }
    
    
  public void Imprimetipo(){
      for(int i = 0 ; i < TipoProduto.tipo.size(); i++){
          System.out.println("Caracteristicas tipo:"+TipoProduto.tipo.get(i));
      }
  }
  
  
  
}
    

