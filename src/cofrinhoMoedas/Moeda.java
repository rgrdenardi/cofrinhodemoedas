package cofrinhoMoedas;

import java.util.Objects;

public abstract class Moeda extends Cofrinho {

	double valor;
	
	// METODO ABSTRATO
	public Moeda(double valor) {
		 super();
		 this.valor = valor;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}


	@Override
	// PERMITE O JAVA COMPARAR SE OS OBJETOS SAO IGUAIS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}


	abstract double getValor();
}
