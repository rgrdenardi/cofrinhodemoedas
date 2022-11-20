package cofrinhoMoedas;

public class Euro extends Moeda {
	double conversao;
	
	public Euro(double valor) {
		super(valor);
	}
	// TRANSFORMA O OBJETO EM UMA FORMA DE REPRESENTAÇÃO NO CONSOLE
	public String toString() {
		return "Euro : " + valor;
	}

	public double getValor() {
		conversao = valor * 6;
		return conversao;
	}
}
