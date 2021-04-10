package CollectionsCasa;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
	public static void main(String[] args) {
//		Conta c1 = new ContaCorrente();
//		c1.depositar(10000);
//		
//		Conta c2 = new ContaCorrente();
//		c2.depositar(3000);
//		
//		
//		Map mapaDeContas = new HashMap();
//		
//		mapaDeContas.put("diretor", c1);
//		mapaDeContas.put("gerente", c2);
//		
//		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
//		
//		System.out.println(contaDoDiretor.getSaldo());
		
		Conta c1 = new ContaCorrente();
		c1.depositar(10000);
		
		Conta c2 = new ContaCorrente();
		c2.depositar(3000);
		
		
		HashMap<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		
		System.out.println(contaDoDiretor.getSaldo());
	}
}
