package CollectionsCasa;

public class Conta {
	private int numero;
	private double saldo;
	private String nome;

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor ) {
		this.saldo += valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
//	 se retirar o hash code quebrar o programa e entra contas com numeros duplicados, 
//	se retornar o metodo hashcode ele limita apenas uma conta com aquele numero em especifico, 
//	não entra conta com numero duplicado
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	
}
