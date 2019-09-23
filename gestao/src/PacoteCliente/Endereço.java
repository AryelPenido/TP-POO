
package PacoteCliente;

public class Endereço {
    String CEP;
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;
    String pais;
    
    
    
    
    public Endereço(String CEP,String rua,int numero,String bairro,String cidade,String estado,String pais){
        this.CEP = CEP;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }
    
    public  Endereço GetEndereço(){
        return this;
    }
    
}
