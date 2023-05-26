/* Ler um valor e escrever se é positivo, negativo ou zero. */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio27Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();

		if (valor < 0)
			System.out.println("\n" + valor + " é negativo.");
		else if (valor == 0)
			System.out.println("\n" + valor + " é zero.");
		else
			System.out.println("\n" + valor + " é positivo.");

		sc.close();

	}

}
