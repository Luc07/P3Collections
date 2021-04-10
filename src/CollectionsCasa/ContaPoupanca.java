package CollectionsCasa;
// se retirar o implements comparable<ContaPoupanca> ele da pau, 
//da um erro dizendo que o sorte no tipo colletions não é aplicavel para os argumentso List<ContaPoupanca>
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	private static final double TAXA = 0.05;
	private String nomeDoCliente;
	
//	Comparação de numero das contas para ordernar
//	@Override
//	public int compareTo(ContaPoupanca o) {
//		if(this.getNumero() < o.getNumero()) {
//			return -1;
//		}
//		if(this.getNumero() > o.getNumero()) {
//			return 1;
//		}
//		return 0;
//	}
	@Override
	public int compareTo(ContaPoupanca o) {
		if(this.nomeDoCliente.compareTo(o.nomeDoCliente) < 0) {
			return -1;
		}
		if(this.nomeDoCliente.compareTo(o.nomeDoCliente) > 0) {
			return 1;
		}
		return 0;
	}
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	
}
