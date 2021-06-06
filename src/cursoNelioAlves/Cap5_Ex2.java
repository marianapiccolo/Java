package cursoNelioAlves;

import java.util.Scanner;

public class Cap5_Ex2 {

	// Fazer um programa para ler um número inteiro e dizer se este número é par ou
	// ímpar.

	public static void main(String[] args) {

		int inteiro;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");

		inteiro = sc.nextInt();

		if (inteiro % 2 == 0) {
			System.out.println("O número é par!");
		}

		else
			System.out.println("O número é ímpar");

	}

}
