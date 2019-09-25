
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
    
    
    public void ImprimeEndereço(){
        
        System.out.println("CEP: "+CEP);
        System.out.println("rua: "+rua);
        System.out.println("numero:"+numero);
        System.out.println("bairro:"+bairro);
        System.out.println("cidade: "+cidade);
        System.out.println("estado: "+estado);
        System.out.println("pais: "+pais);
    }
    
    
    
    
    
    public  Endereço GetEndereço(){
        return this;
    }
    
}
