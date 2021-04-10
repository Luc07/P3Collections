package CollectionsCasa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Banco {
	private List<Conta> contas = new ArrayList<Conta>();
	private Map<String, Conta> map = new HashMap<String, Conta>();
	private HashSet<Conta> contaHash = new HashSet<Conta>();
	
	private void adicionar(Conta c) {
		contas.add(c);
		map.put(c.getNome(), c);
		contaHash.add(c);
	}
	
	private Conta pega(int x) {
		return contas.get(x);
	}
	
	private int pegaTotalDeContas() {
		return contas.size();
	}
	
	private Conta buscaPorNome(String nome) {
		return map.get(nome);
	}
	
	public static void main(String[] args) {
		Banco b = new Banco();
		
		Conta c1 = new Conta();
		c1.setNome("Lucas");
		c1.depositar(5000);
		c1.setNumero(25466);
		
		Conta c2 = new Conta();
		c2.setNome("Jorge");
		c2.depositar(6000);
		c2.setNumero(14466);
		
		Conta c3 = new Conta();
		c3.setNome("Ana");
		c3.depositar(1000);
		c3.setNumero(87566);
		
		b.adicionar(c1);
		b.adicionar(c2);
		b.adicionar(c3);
		System.out.println(b.contaHash.size());
		
		Conta c4 = new Conta();
		c4.setNome("Hugo");
		c4.depositar(2550);
		c4.setNumero(87566);
		
		b.adicionar(c4);
		System.out.println(b.contaHash.size());
		
		
	}
}
