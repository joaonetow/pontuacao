package aplicacao;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System .in);
		
		//CABECALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println();
		System.out.println();
		
	   //LEITURA DO VOLUME
		
		int quantidadeCompras;
		double ticketMedio;
		
		System.out.print("Quantas compras o cliente fez no �ltimo ano?");
		quantidadeCompras = sc.nextInt();
		
		System.out.print("Qual o ticket m�dio?");
		ticketMedio = sc.nextDouble();

		
		
	}
	
}



