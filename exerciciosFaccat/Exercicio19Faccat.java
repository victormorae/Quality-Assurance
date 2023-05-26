/* Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio19Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int valor1 = sc.nextInt();

		System.out.println("Digite o segundo valor:");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {

		System.out.println("O maior valor é " + valor1);

		} else if (valor1 == valor2) {

		System.out.println("Os dois valores são iguais.");
		
		} else {

		System.out.println("O maior valor é " + valor2);

		}

		sc.close();
		
	}

}
