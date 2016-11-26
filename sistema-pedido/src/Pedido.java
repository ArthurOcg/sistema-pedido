import java.util.ArrayList;
import java.util.List;

public class Pedido {

	
	private List<LinhaPedido> linhas;
	
	
	public Pedido(){
		
		linhas = new ArrayList<LinhaPedido>();		
	}
	
	
	public boolean adionaLinha(LinhaPedido linha){		
		
		return linhas.add(linha);
	}
	
	
	public double totalFinal(){
		
		double  total = 0;
		
		for (LinhaPedido linhaPedido : linhas) {
			total += linhaPedido.totalLinha();
		}
		
		return total;
	}
	
	
}
