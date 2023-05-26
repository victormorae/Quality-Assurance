// Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio28Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o primeiro valor: ");
		int valor1 = sc.nextInt();

		System.out.println("Escreva o segundo valor: ");
		int valor2 = sc.nextInt();

		System.out.println("Escreva o terceiro valor: ");
		int valor3 = sc.nextInt();

		if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3)
			System.out.println("Os valores não podem ser iguais.");
		else if (valor1 > valor2 && valor1 > valor3)
			System.out.println("\n" + valor1 + " é o maior valor apresentado.");
		else if (valor2 > valor1 && valor2 > valor3)
			System.out.println("\n" + valor2 + " é o maior valor apresentado.");
		else
			System.out.println("\n" + valor3 + " é o maior valor apresentado.");

		sc.close();

	}

}
