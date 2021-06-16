package cursoNelioAlves;

import java.util.Scanner;

public class Cap6_Ex5 {
	
	/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos 
	 * em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] 
	 * e quantos estão fora do intervalo, mostrando essas informações conforme exemplo 
	 * (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		
		System.out.println("Digite um número de entrada: ");
		n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
	

	}

}
