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
		
		System.out.print("Quantas compras o cliente fez no último ano?");
		quantidadeCompras = sc.nextInt();
		
		System.out.print("Qual o ticket médio?");
		ticketMedio = sc.nextDouble();

		//LEITURA DOS OUTROS DADOS
		
		int quantidadeAtrasos;
		char formaPagamento;		
				
		System.out.print("Quantas vezes o cliente atrasou o pagamento?");
		quantidadeAtrasos = sc.nextInt();
				
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)?");
		formaPagamento = sc.next().charAt(0);

		
	}
	
}



