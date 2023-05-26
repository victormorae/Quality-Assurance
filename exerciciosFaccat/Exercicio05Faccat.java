//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio05Faccat {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor: ");
			int valor = sc.nextInt();
			int resultado = valor - 1;

			System.out.println("O número antecessor do digitado é: " + resultado);
			sc.close();

		}

		catch (Exception e) {

			System.out.println("Valor inválido. Favor inserir um número correto " + e);

		}

	}

}
