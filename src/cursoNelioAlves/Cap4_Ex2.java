package cursoNelioAlves;

import java.util.Scanner;

public class Cap4_Ex2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 */

		double area, raio, pi = 3.14159;

		Scanner sc = new Scanner(System.in);

		raio = sc.nextDouble();

		area = pi * raio * raio;

		System.out.printf("O valor da área do círculo é %.4f", area);

	}

}
