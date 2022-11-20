package cofrinhoMoedas;

public class Real extends Moeda {
	double conversao;
	
	public Real(double valor) {
		super(valor);
	}
	// TRANSFORMA O OBJETO EM UMA FORMA DE REPRESENTAÇÃO NO CONSOLE
	public String toString() {
		return "Real : " + valor;
	}
	
	public double getValor() {
		conversao = valor * 1;
		return conversao;
	}
	
	
}
