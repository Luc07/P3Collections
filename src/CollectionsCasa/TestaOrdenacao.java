package CollectionsCasa;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TestaOrdenacao {
	public static void main(String[] args) {
//		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
//		
//		colocando a linked list quando é rodado não muda nada na resposta obtida
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		// Ordernacao de contas pelo nome do cliente
		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.setNomeDoCliente("Lucas");
		contas.add(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca();
		cp2.setNomeDoCliente("Caio");
		contas.add(cp2);
		
		ContaPoupanca cp3 = new ContaPoupanca();
		cp3.setNomeDoCliente("Ana");
		contas.add(cp3);
		
		Collections.sort(contas);
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getNomeDoCliente());
		}
		
//		ContaPoupanca cp1 = new ContaPoupanca();
//		cp1.setNumero(4763);
//		contas.add(cp1);
//		
//		ContaPoupanca cp2 = new ContaPoupanca();
//		cp2.setNumero(8035);
//		contas.add(cp2);
//		
//		ContaPoupanca cp3 = new ContaPoupanca();
//		cp3.setNumero(4195);
//		contas.add(cp3);
//		
//		ContaPoupanca cp4 = new ContaPoupanca();
//		cp4.setNumero(4530);
//		contas.add(cp4);
//		ContaPoupanca cp5 = new ContaPoupanca();
//		cp5.setNumero(5195);
//		contas.add(cp5);
//		
//		ContaPoupanca cp6 = new ContaPoupanca();
//		cp6.setNumero(6195);
//		contas.add(cp6);
//		
//		ContaPoupanca cp7 = new ContaPoupanca();
//		cp7.setNumero(7895);
//		contas.add(cp7);
//		
//		ContaPoupanca cp8 = new ContaPoupanca();
//		cp8.setNumero(2364);
//		contas.add(cp8);
//		
//		Collections.sort(contas);
//		
//		System.out.println("Crescente:");
//		for (int i = 0; i < contas.size(); i++) {
//			System.out.println(contas.get(i).getNumero());
//		}
//		
//		System.out.print("\n");
//		System.out.println("Decrescente:");
//		Comparator<ContaPoupanca> c = Collections.reverseOrder();
//		Collections.sort(contas, c);
//		for (int i = 0; i < contas.size(); i++) {
//			System.out.println(contas.get(i).getNumero());
//		}
//		System.out.print("\n");
//		System.out.println("Rotacionar:");
//		Collections.rotate(contas, 3);
//		for (int i = 0; i < contas.size(); i++) {
//			System.out.println(contas.get(i).getNumero());
//		}
//		System.out.print("\n");
//		System.out.println("Embaralhar:");
//		Collections.shuffle(contas);
//		for (int i = 0; i < contas.size(); i++) {
//			System.out.println(contas.get(i).getNumero());
//		}
	}
}
