package cursoNelioAlves;

import java.util.Scanner;

public class Cap6_Ex8 {

	/*Ler um valor N. Calcular e escrever seu respectivo fatorial. 
	 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.	 
	Lembrando que, por definição, fatorial de 0 é 1.*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, fat = 1;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		for (i = 1; i <=n; i++) {
			fat = fat * i;			
		}
		System.out.println("O fatorial é :" + fat);
		
	}

}
