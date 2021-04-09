package CollectionsSala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Questao02 {
	public static void main(String[] args) {
		ArrayList<Integer> meuArrayList = new ArrayList<Integer>();
		
		for (int i = 1; i <= 1000; i++) {
			meuArrayList.add(i);
		}
		Comparator<Integer> c = Collections.reverseOrder();
		Collections.sort(meuArrayList, c);
		System.out.println(meuArrayList);
	}
}
