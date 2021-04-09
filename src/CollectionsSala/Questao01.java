package CollectionsSala;

import java.util.TreeSet;

public class Questao01 {
	public static void main(String[] args) {
		TreeSet<Integer> minhaColletions = new TreeSet<Integer>();
		for (int i = 1; i <= 1000; i++) {
			minhaColletions.add(i);
		}
		System.out.println(minhaColletions.descendingSet());
	}
}
