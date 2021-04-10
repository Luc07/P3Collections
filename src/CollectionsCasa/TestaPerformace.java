package CollectionsCasa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformace {
	public static void main(String[] args) {
//		System.out.println("Inicio...");
//		long inicio = System.currentTimeMillis();
//		Collection<Integer> test = new ArrayList<Integer>();
//		
//		int total = 30000;
//		
//		for (int i = 0; i < total; i++) {
//			test.add(i);
//		}
//		for (int i = 0; i < total; i++) {
//			test.contains(i);
//		}
//		long fim = System.currentTimeMillis();
//		long tempo = fim - inicio;
//		
//		System.out.println("Tempo Gasto: "+tempo);
		// media de 420
		
//		System.out.println("Inicio...");
//		long inicio = System.currentTimeMillis();
//		Collection<Integer> test = new HashSet<Integer>();
//		
//		int total = 30000;
//		
//		for (int i = 0; i < total; i++) {
//			test.add(i);
//		}
//		for (int i = 0; i < total; i++) {
//			test.contains(i);
//		}
//		long fim = System.currentTimeMillis();
//		long tempo = fim - inicio;
//		
//		System.out.println("Tempo Gasto: "+tempo);
		// media de 10
		
		System.out.println("Inicio...");
		long inicio = System.currentTimeMillis();
		Collection<Integer> test = new HashSet<Integer>();
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			test.add(i);
		}
		long fimFor1 = System.currentTimeMillis();
		long tempoFor1 = fimFor1 - inicio;
		System.out.println("Tempo de inserção: "+tempoFor1);
		
		for (int i = 0; i < total; i++) {
			test.contains(i);
		}
		long fimFor2 = System.currentTimeMillis();
		long tempoFor2 = fimFor2 - inicio;
		
		System.out.println("Tempo de pesquisa: "+tempoFor2);
		
		// pesquisa é mais lenta do que a inserção, 30mil buscas é mais lento que inserir 30mil elementos
		
	}
}
