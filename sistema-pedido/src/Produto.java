
public class Produto {

	private Double preco;
	private String nome;
	
	
	public Produto(){
		
	}
	
	public Produto(String nome, double preco){
		if(preco<0){
			throw new IllegalArgumentException("N�o � permitido pre�o negativo");
		}
		this.nome = nome;
		this.preco = preco;
		
	}
	
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		if(preco<0){
			throw new IllegalArgumentException("N�o � permitido pre�o negativo");
		}
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
