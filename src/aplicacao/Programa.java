package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System .in);
		
		//CABECALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();
		System.out.println();
		
	   //LEITURA DO VOLUME
		
		int quantidadeCompras;
		double ticketMedio;
		
		System.out.print("Quantas compras o cliente fez no último ano? ");
		quantidadeCompras = sc.nextInt();
		
		System.out.print("Qual o ticket médio? ");
		ticketMedio = sc.nextDouble();

		//LEITURA DOS OUTROS DADOS
		
		int quantidadeAtrasos;
		char formaPagamento;		
				
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		quantidadeAtrasos = sc.nextInt();
				
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B) ? ");
		formaPagamento = sc.next().charAt(0);

		//SCORE VOLUME COMPRAS
		
				
		int scoreVolumeCompras;
				
				
		if(quantidadeCompras == 0) {
					
					scoreVolumeCompras = 0;					
				} 
		
		else if (quantidadeCompras * ticketMedio <= 3000 && quantidadeCompras <= 2 ) {
					
					scoreVolumeCompras = 20;					
				} 
		
		else if (quantidadeCompras * ticketMedio >= 3000 && quantidadeCompras > 2 ) {
					
					scoreVolumeCompras = 30;				
				} 
		
		else {
					scoreVolumeCompras = 40;					
				} 
				
				System.out.println();
				System.out.printf("Score de volume de compras = %d pontos%n", scoreVolumeCompras);
				
				
		 //SCORES INADIMPLENCIA E PAGAMENTO
				
				
		int scoreInadimplencia;
				
		if(quantidadeAtrasos > 1 ||  quantidadeCompras == 0) {
					
					scoreInadimplencia = 0;					
				} 
		else if (quantidadeCompras > 0 && quantidadeAtrasos >= 1) {
					
					scoreInadimplencia = 15;					
				} 
		else {
					
					scoreInadimplencia = 30;
				}
				
				System.out.println();
				System.out.printf("Score de inadimplência = %d pontos %n", scoreInadimplencia);
				
				
		int scoreFormaPagamento = 0;
				
		if(quantidadeCompras > 0 && formaPagamento == 'D') {
					
					scoreFormaPagamento = 5;
		       } 
		
		else if(quantidadeCompras > 0) {
					
					scoreFormaPagamento = 10;
				} 		
				
				System.out.printf("Score de forma de pagamento = %d %n", scoreFormaPagamento);
				
		 // CLASSIFICACAO FINAL
				
				
			System.out.println();
				
			int scoreTotal = scoreFormaPagamento + scoreInadimplencia + scoreVolumeCompras;
				
			if(scoreTotal >= 0 && scoreTotal <= 25) {
					
					System.out.println("Classificação final = CLIENTE BRONZE");
					
				} 
			
			else if (scoreTotal > 25 && scoreTotal <= 75) {
					
					System.out.println("Classificação final = CLIENTE PRATA");
					
				} 
			
			else {
					
					System.out.println("Classificação final = CLIENTE OURO");
					
				}
	}
	
}



