//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
//Considerar ano com 365 dias e mês com 30 dias. 

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio07Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade expressa apenas em anos: ");
		int ano = sc.nextInt();

		System.out.println("Digite a quantidade de meses passados desde seu último aniversário: ");
		int meses = sc.nextInt();

		System.out.println("Digite a quantidade de dias que passou desde seu último mêsversário: ");
		int dias = sc.nextInt();
		int idadeDias = (ano * 365) + (meses * 30) + dias;

		sc.close();
		
		System.out.println("A sua idade expressa em dias é igual a: " + idadeDias);

	}

}
