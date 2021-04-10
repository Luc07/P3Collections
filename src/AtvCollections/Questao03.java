package AtvCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Questao03 {
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i = 1; i <= 200; i++) {
			num.add(i);
		}
		
		Comparator<Integer> c = Collections.reverseOrder();
		
		Collections.sort(num, c);
		System.out.println(num);
	}
}
