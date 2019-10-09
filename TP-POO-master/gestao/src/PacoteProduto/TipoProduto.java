
package PacoteProduto;

import java.util.ArrayList;
import java.util.Scanner;


public class TipoProduto {
    String s1,s2;
    
    
    
    public TipoProduto(String t){
       //tipo.add(t);
       if(t.equalsIgnoreCase("Cd")){
           TipoCd(s1,s2);
       }
       if(t.equalsIgnoreCase("dvd")){
           TipoDVD(s1,s2);
       }
       if(t.equalsIgnoreCase("livros")){
           TipoLivros(s1,s2);
       }
       if(t.equalsIgnoreCase("jogos")){
           TipoJogos(s1,s2);
       }
   }
    
    
   
    //fazer mais tipo de exemplo;
    private  void TipoCd(String s1,String s2){
        Scanner s = new Scanner(System.in);
        String gravação;
        String anoLançamento;
        String artista;
        System.out.println("Tipo cd");
        System.out.println("Gravado?");
        gravação = s.next();
        if(gravação.equalsIgnoreCase("sim")){
            System.out.println("Nome do artista:");
            artista = s.next();
            this.s1 = artista;
            System.out.println("ano de lançamento");
            anoLançamento  = s.next();
            this.s2 = anoLançamento;
        }
        //adcTipoProduto(tipo);
        //Imprimetipo();
     
    }
    
    private void TipoLivros(String s1,String s2){
        String titulo,autor;
        Scanner s = new Scanner(System.in);
        System.out.println("Tipo Livro");
        System.out.println("título");
        titulo = s.next();
        this.s1 = titulo;
        System.out.println("autor");
        autor = s.next();
        this.s2 = autor;
      
    }
    
    private void TipoJogos(String s1,String s2){
        String titulo,ano;
        Scanner s = new Scanner(System.in);
        System.out.println("Tipo jogos");
        System.out.println("título");
        titulo = s.next();
        this.s1 = titulo;
        System.out.println("ano de lançamento");
        ano = s.next();
        this.s2 = ano;
        
    }
    
    private void TipoDVD(String s1,String s2){
        String titulo,lancamento;
        Scanner s = new Scanner(System.in);
        System.out.println("Tipo DVD:");
        System.out.println("título");
        titulo = s.next();
        this.s1 = titulo;
        System.out.println("lançamento");
        lancamento = s.next();
        this.s2 = lancamento;
        
        //Imprimetipo();
    }
    
    
  public void Imprimetipo(){
      System.out.println(s1);
      System.out.println(s2);
      
  }
  
  
  
}
    

