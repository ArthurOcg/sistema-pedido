import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {
	
	Produto produto1;
	Produto produto2;

	@Before
	public void setUp() throws Exception {
		
		produto1 = new Produto("Pincel", 3.00);
		produto2  = new Produto();
		
	}

	@Test
	public void testGetPreco() {
		
		
		assertEquals(3.00, produto1.getPreco(),0.1);
		produto1.setPreco(3.50);
		assertEquals(3.50, produto1.getPreco(),0.1);
		assertNull(produto2.getPreco());
		produto2.setPreco(2.50);
		assertEquals(2.50, produto2.getPreco(), 0.1);
		
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testException(){
		
		produto2.setPreco(-1.70);
		new Produto("Pia", - 70.50);
		
	}
	

}
