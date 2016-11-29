import java.util.HashMap;

import java.util.Map;

public class EstoqueDAO {
	
	Map<Produto, Integer> estoque;
	
	
	public EstoqueDAO(){
		
		estoque = new HashMap<>();
		
	}			
	
	
	public void inserirProduto(Produto produto, int quantidade){
		
		estoque.put(produto, quantidade);
		
	}
	
	
	public boolean removerProduto(Produto produto, int quantidade){
		
		
		
		return false;
	}

	
	public int getQuantidade(Produto produto){
		
		
		return estoque.get(produto);
	}
	
	public boolean possuiProduto(Produto produto){
		
		
		return estoque.containsKey(produto);
	}
	
	 public void atualizarProduto(Produto produtoAntigo, Produto produtoNovo){
		 
		 
	 }
	 
	 
	 public Produto procurarPorNome(String nome){
		 
		 return null;
	 }
	
	
}

