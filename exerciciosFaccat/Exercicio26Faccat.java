/* Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'.
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio26Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade atual de peixes em estoque: ");
		int quantAtual = sc.nextInt();
		
		System.out.println("Digite a quantidade máxima de peixes em estoque: ");
		int quantMax = sc.nextInt();
		
		System.out.println("Digite a quantidade mínima de peixes em estoque: ");
		int quantMin = sc.nextInt();
		int quantMed = (quantMax + quantMin) / 2;
		
		if (quantAtual >= quantMed)
			System.out.println("\nNão efetuar compra");
		else
			System.out.println("\nEfetuar compra");
	
		sc.close();
		
	}

}
