
package Model.Persistencia;

import Model.Entidade.Produto;
import java.util.ArrayList;

/**
 *
 * @author hillison
 */
public class ProdutoDAO {
    
    private final ArrayList <Produto> ListaProdutos;
    
    public ProdutoDAO(){
        this.ListaProdutos = new ArrayList<>();
    }
    
    public Produto Busca (String id){
        for (Produto p : ListaProdutos){
            if ( p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    
    public Produto Insere (String id,String descricao,int qtd,Double preco, String categoria,String tipo){
        Produto p = new Produto (id, descricao, qtd, preco, categoria, tipo);
        ListaProdutos.add(p);
        return p;
    }
    
    public Produto Altera(String  id, String descricao, Double preco, int qtd){
        Produto p = Busca(id);
        if (p != null){
            if (descricao != p.getDescricao()){
                p.setDescricao(descricao);
            }
            if (preco != p.getPreco()){
                p.setPreco(preco);
            }
            if (qtd != p.getQtd()){
                p.setQtd(qtd);
            }
            return p;
        }
        else return null;
    }
    
    public ArrayList<Produto> ListarTodos(){
        return ListaProdutos;
    }
}
