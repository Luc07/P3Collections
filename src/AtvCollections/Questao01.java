package AtvCollections;

import java.util.ArrayList;
import java.util.HashSet;

public class Questao01 {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		HashSet<Integer> hash = new HashSet<Integer>();
		
		lista.add(1);
		lista.add(1);
		lista.add(1);
		lista.add(1);
		lista.get(0);
		for (int i = 0; i < lista.size(); i++) {
			lista.remove(0);
		}
		long fimList = System.currentTimeMillis();
		
		System.out.println("Tempo Lista: "+(fimList - inicio));
		
		hash.add(1);
		hash.add(1);
		hash.add(1);
		hash.add(1);
		hash.contains(1);
		for (int i = 0; i < hash.size(); i++) {
			hash.remove(1);
		}
		long fimHash = System.currentTimeMillis();
		System.out.println("Tempo Hash: "+(fimHash - inicio));
		
	}
}
