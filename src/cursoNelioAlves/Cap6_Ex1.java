package cursoNelioAlves;

import java.util.Locale;
import java.util.Scanner;

public class Cap6_Ex1 {
	
	/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
	Para cada leitura de senha incorreta informada, 
	escrever a mensagem "Senha Invalida". 
	Quando a senha for informada corretamente deve ser	impressa a mensagem "Acesso Permitido" 
	e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int senha;
		
		System.out.println("Digite sua senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida");
			System.out.println("Digite sua senha: ");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso permitido");
		
		
		
		
		
		
		
		

	}

}
