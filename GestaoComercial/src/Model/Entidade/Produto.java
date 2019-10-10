
package Model.Entidade;

import java.util.ArrayList;

/**
 *
 * @author aryels
 */
public class Produto {
    private String id;
    private String descricao;
    private int qtd;
    private Double preco;
    private String categoria;
    private String tipo;
    
    public Produto(String id,String descricao,int qtd,Double preco, String categoria,String tipo){
        this.id = id;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
        this.categoria = categoria;
        this.tipo = tipo;
    }
        
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public String getId() {
        return id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
        
    public void ImprimeProduto(){
       System.out.println("Caracteristicas produto");
       System.out.println("idproduto: "+getId());
       System.out.println("descricao: "+getDescricao());
       System.out.println("qtd: "+getQtd());
       System.out.println("categoria: "+getCategoria());
        System.out.println("Tipo: "+getTipo());
   }


}
