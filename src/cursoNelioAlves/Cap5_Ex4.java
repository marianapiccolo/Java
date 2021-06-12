package cursoNelioAlves;

import java.util.Scanner;

public class Cap5_Ex4 {
	
	/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
	 * sabendo que o mesmo pode começar em um dia e terminar em outro, 
	 * tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicial, finall, duracao;
		
		System.out.println("Hora inicial: ");
		inicial = sc.nextInt();
		System.out.println("Hora final: ");
		finall = sc.nextInt();
		
		if (inicial < finall) {
			duracao = finall - inicial;
		}
		else {
			duracao = (24 - inicial) + finall;
		}
		
		System.out.println("O jogo durou: " + duracao + " hora(s)");
				

	}

}
