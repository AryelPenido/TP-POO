
package Model.Entidade;

import java.util.ArrayList;

/**
 *
 * @author aryels
 */
public class Produto {
    String id;
    String descricao;
    int qtd;
    Double preco;
    String categoria;
    String tipo;
    
    public Produto(String id,String descricao,int qtd,Double preco, String categoria,String tipo){
        this.id = id;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
        this.categoria = categoria;
        this.tipo = tipo;
    }
    
    public double GetPreco(){
        return preco;
    }
    
    public String  GetId(){
        return id;
    }
    
    public void SetQtd(int qtd){
        this.qtd = qtd;
    }
    
    public void SetPreco(double preco){
        this.preco = preco;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
