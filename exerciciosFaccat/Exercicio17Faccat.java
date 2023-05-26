/* Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada.
 */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio17Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota da primeira avaliação: ");
		double primeiraNota = sc.nextDouble();

		System.out.println("Digite a nota da segunda avaliação: ");
		double segundaNota = sc.nextDouble();
		double mediaFinal = (primeiraNota + segundaNota) / 2;

		if (primeiraNota < 0.0 || segundaNota < 0.0 || primeiraNota > 10.0 || segundaNota > 10.0) {

			System.out.println("\nNota inválida, por favor tente novamente.");

		} else if (mediaFinal >= 6) {

			System.out.println("\nMédia: " + mediaFinal);
			System.out.println("Aluno(a) aprovado(a).");

		} else {

			System.out.println("\nMédia: " + mediaFinal);
			System.out.println("Aluno(a) reprovado(a).");

		}

		sc.close();

	}

}
