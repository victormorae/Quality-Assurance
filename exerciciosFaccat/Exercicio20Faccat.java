/* Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 
 */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio20Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int valor1 = sc.nextInt();

		System.out.println("Digite o segundo valor:");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {

			System.out.println(
					"O menor valor digitado foi: " + valor2 + ". O maior valor digitado foi: " + valor1 + ".");

		} else if (valor1 == valor2) {

			System.out.println("Os dois valores são iguais, favor utilizar valores diferentes.");

		} else {

			System.out.println(
					"O menor valor digitado foi: " + valor1 + ". O maior valor digitado foi: " + valor2 + ".");

		}

		sc.close();

	}

}
