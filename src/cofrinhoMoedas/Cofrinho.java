package cofrinhoMoedas;

import java.util.ArrayList;

public class Cofrinho { 

	ArrayList<Moeda> cofrinho = new ArrayList<Moeda>();
	
	public void adicionar(Moeda m) {
		cofrinho.add(m);
	}
	
	public void remover(Moeda m) {
		cofrinho.remove(m);
	}
	
	public void listar() {
		
		for (Moeda m : cofrinho) {
			System.out.println(m);
		}
	}
	
	// CALCULA TOTAL EM REAIS ATRAVES DO METODO GETVALOR PRESENTE NAS MOEDAS
	public void total() {
		double total = 0;
		for (Moeda m : cofrinho) {
		total += m.getValor();
		}
		System.out.println(total);
	}
}
