package Controller;

import Model.Entidade.Produto;
import Model.Persistencia.ProdutoDAO;
import java.util.ArrayList;

/**
 *
 * @author hillison
 */
public class ProdutoControle {
    
    private final ProdutoDAO produtoDao;
    
    public ProdutoControle(){
        produtoDao = new ProdutoDAO();
    }
    
    public Produto busca(String id){
        return produtoDao.Busca(id);
    }
    
    public Produto insere(String id,String descricao,int qtd,Double preco, String categoria,String tipo){
        Produto p = produtoDao.Busca(id);
        if(p == null){
            return produtoDao.Insere(id, descricao, qtd, preco, categoria, tipo);
        }else{
            System.err.println("Erro ao inserir produto com código "+id+". Código já existente.");
            return null;   
        }
        
    }
    
    public Produto Altera(String id, String descricao, Double preco, int qtd){
        return produtoDao.Altera(id, descricao, preco, qtd);
    }
    
    public ArrayList<Produto> ListarTodos(){
        return produtoDao.ListarTodos();
    }

    
}
