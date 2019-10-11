/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entidade;
import java.util.ArrayList;
import java.util.Map;

public class Cliente {
    String codCliente;
    private String CPF;
    private String nome;
    private String email;
    private String senha;
  // ArrayList <Endereço> endereço = new ArrayList<>();
    private String CEP;
    private String numero;
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Pais;
   
    public Cliente( String codCliente,String CPF,String nome,String email,String senha, String CEP,String numero,String Rua,String Bairro,String Cidade, String Estado, String Pais){
       
        this.codCliente = codCliente;
        this.nome = nome;
        this.senha = senha;
        this.CPF = CPF;
        this.email = email;
        this.CEP = CEP;
        this.numero =numero;
        this.Rua = Rua;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Pais = Pais;
        //endereço.add(e);
    }
    
    
    /*public void SetEndereço(Endereço e){
        System.out.println("endereço");
        endereço.add(e);
    }*/
    
    
    public void SetNome(String nome){
        this.nome= nome;
    }
    
    public void SetcodCliente(String codCleinte){
        this.codCliente = codCliente;
    }
    
    public void SetSenha(String senha){
        this.senha = senha;
    }
    
    
    public void SetCpf(String CPF){
        this.CPF = CPF;
        
    }
    
     
    public void SetEmail(String email){
       this.email = email;    
    }
    

    public String Getnome(){
        return nome;
    }
    public String GetCPF(){
        return CPF;
    }
    
    public String GetcodCliente(){
        return codCliente;
    }//throw new IllegalStateException
    
    public String GetEmail(){
        return email;
    }
    
   /* public void AdcEndereço(Endereço e){
        endereço.add(e);
    }*/


    public void ImprimeCliente(){
          System.out.println("");
          System.out.println("codCliente: "+codCliente);
          System.out.println("nome: "+nome);
          System.out.println("CPF: "+CPF);
          System.out.println("email: "+email);
          
         System.out.println("\nENDEREÇO");
         System.out.println("CEP:"+CEP);
         System.out.println("Rua:"+Rua);
         System.out.println("Numero: "+numero);
         System.out.println("Bairros: "+Bairro);
         System.out.println("Cidade: "+Cidade);
         System.out.println("Estado: "+Estado);
         System.out.println("País: "+Pais);
         
         /* for (Endereço end : endereço) {
               end.ImprimeEndereço();
            }
*/
      }
    
     /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @return the Rua
     */
    public String getRua() {
        return Rua;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @return the Pais
     */
    public String getPais() {
        return Pais;
    }

  

  

}
