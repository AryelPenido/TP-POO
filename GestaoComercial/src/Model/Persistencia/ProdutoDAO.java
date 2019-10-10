
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
    
    public Produto Altera(String  id, String descricao, Double preco){
        Produto p = Busca(id);
        if (p != null){
            if (descricao != null){
                p.setDescricao(descricao);
            }
            if (preco != null){
                p.setPreco(preco);
            }
            return p;
        }
        else return null;
    }
    
    public Produto AlteraQtd(String id, int qtd){
        Produto p = Busca(id);
        if (p != null){
            p.setQtd(qtd);
            return p;
        }
        return null;
    }
    
    public ArrayList<Produto> ListarTodos(){
        return ListaProdutos;
    }
}
