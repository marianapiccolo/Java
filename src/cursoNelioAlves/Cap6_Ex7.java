package cursoNelioAlves;

import java.util.Locale;
import java.util.Scanner;

public class Cap6_Ex7 {
	
	/*Fazer um programa para ler um número N. 
	 * Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. 
	Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double x, y;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		for (i = 0; i <n; i++) {
			System.out.println("Digite dois números: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			double div = 0;
			if (y == 0) {
				System.out.println("Divisão impossível!");
			}
			else
				div = x/y;
				System.out.printf("Divisão: %.1f%n", div);
			
		}
		
		
	}

}
