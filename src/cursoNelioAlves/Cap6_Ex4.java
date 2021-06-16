package cursoNelioAlves;

import java.util.Scanner;

public class Cap6_Ex4 {
	
	/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
	 * um valor por linha, inclusive o X, se for o caso.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, i;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
			
		
		for (i = 1; i <= x; i++) {
			
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		

	}

}
