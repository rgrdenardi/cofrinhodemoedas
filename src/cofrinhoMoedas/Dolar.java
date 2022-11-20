package cofrinhoMoedas;

public class Dolar extends Moeda{
	double conversao;
	public Dolar(double valor) {
		super(valor);
	}
	// TRANSFORMA O OBJETO EM UMA FORMA DE REPRESENTAÇÃO NO CONSOLE
	public String toString() {
		return "Dolar : " + valor;
	}

	public double getValor() {
		conversao = valor * 4;
		return conversao;
	}
}
