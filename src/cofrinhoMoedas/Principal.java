package cofrinhoMoedas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int RU = 3929735;
		mostraLista();
			
	}
	
	
	public static void mostraLista() {
		
		Cofrinho cofrinho = new Cofrinho();
		
		// ESCUTA INPUTS
		Scanner input = new Scanner(System.in);	
		
		
		System.out.print("Selecione uma opção:"
			 	+ "\n1 - Listar Moedas"
			 	+ "\n2 - Adicionar Moeda"		
			 	+ "\n3 - Remover Moeda"	
			 	+ "\n4 - Converter tudo para Real"	
			 	+ "\n0 - Encerrar Programa");
        
		int opcao = input.nextInt();
		int tipoMoeda;
		double valor;
		Moeda m;
		
		while(opcao != 0) {
        switch (opcao)	{
        case 1:
        	cofrinho.listar();
        	break;
        case 2:
        	tipoMoeda=0;
			while(tipoMoeda>3 || tipoMoeda<=0) {
        	System.out.print("Selecione a moeda:"
    			 	+ "\n1 - Real"
    			 	+ "\n2 - Dolar"		
    			 	+ "\n3 - Euro"	
    			 	+ "\n0 - Sair");
        	tipoMoeda = input.nextInt();
			}
			System.out.println("Qual o valor?");
			valor = input.nextInt();
			
			m = null;
			if(tipoMoeda==1) {
				m = new Real(valor);
			}
			else if(tipoMoeda==2){
				m = new Dolar(valor);
				
			}	else {
				m = new Euro(valor);
			}
			 cofrinho.adicionar(m);
        	break;
        case 3:
        	tipoMoeda=0;
			while(tipoMoeda>3 || tipoMoeda<=0) {
        	System.out.print("Selecione a moeda:"
    			 	+ "\n1 - Real"
    			 	+ "\n2 - Dolar"		
    			 	+ "\n3 - Euro"	
    			 	+ "\n0 - Sair");
        	tipoMoeda = input.nextInt();
			}
			System.out.println("Qual o valor?");
			valor = input.nextInt();
			
			m = null;
			if(tipoMoeda==1) {
				m = new Real(valor);
			}
			else if(tipoMoeda==2){
				m = new Dolar(valor);
				
			}	else {
				m = new Euro(valor);
			}
			 cofrinho.remover(m);
        	break;
        case 4:
        	cofrinho.total();
        	break;
        
        }
		System.out.print("Selecione uma opção:"
			 	+ "\n1 - Listar Moedas"
			 	+ "\n2 - Adicionar Moeda"		
			 	+ "\n3 - Remover Moeda"	
			 	+ "\n4 - Converter tudo para Real"	
			 	+ "\n0 - Encerrar Programa");
		opcao=input.nextInt();	
       
		
	}
		System.out.println("Programa Finalizado");
		input.close();
	}
}
