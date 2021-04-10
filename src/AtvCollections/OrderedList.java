package AtvCollections;

import java.util.ArrayList;

public class OrderedList {
	ArrayList<Integer> lista;

	public OrderedList(ArrayList<Integer> lista) {
		super();
		this.lista = lista;
	}
	
	private void adicionar(int x) {
		lista.add(x);
	}
	
	private int pega(int x) {
		return lista.get(x);
	}
	
	private void remover(int x) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i) == x) {
				lista.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		OrderedList l = new OrderedList(lista);
		l.adicionar(50);
		System.out.println(l.pega(0));
		l.remover(50);
		System.out.println(lista);
	}
}
