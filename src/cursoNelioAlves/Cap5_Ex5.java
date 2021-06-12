package cursoNelioAlves;

import java.util.Scanner;

public class Cap5_Ex5 {

	/*Com base na tabela abaixo, escreva um programa que leia o código de um item e 
	 * a quantidade deste item. Aseguir, calcule e mostre o valor da conta a pagar.
	 * Código 1: Cachorro Quente, 4 reais.
	 * Código 2: X-Salada, 4.50 reais.
	 * Código 3: X-Bacon, 5 reais.
	 * Código 4: Torrada Simples, 2 reais.
	 * Código 5: Refrigerante, 1.50 reais*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int codigo, quantidade;
		
		double total = 0;
		
		System.out.println("Digite o código do produto: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else if (codigo == 5) {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		

	}

}
