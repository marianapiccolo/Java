package cursoNelioAlves;

import java.util.Scanner;

public class Cap4_Ex6 {

	/*
	 * Fazer um programa que leia três valores com ponto flutuante de dupla
	 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
	 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
	 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
	 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
	 * e B.
	 */

	public static void main(String[] args) {

		double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();

		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();

		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();

		areaTriangulo = A * C / 2.0;

		areaCirculo = 3.14159 * C * C;

		areaTrapezio = (A + B) / 2.0 * C;

		areaQuadrado = B * B;

		areaRetangulo = A * B;

		System.out.printf("Área triângulo: %.3f%n", areaTriangulo);
		System.out.printf("Área círculo: %.3f%n", areaCirculo);
		System.out.printf("Área trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Área quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Área retângulo: %.3f%n", areaTriangulo);

	}
}
