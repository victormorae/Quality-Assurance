/*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 
 *
 */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio15Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Apresente um valor: ");
		double n = sc.nextDouble();
		
		if (n < 0) {
			
		System.out.println("O valor apresentado é negativo.");
			
		}	else
			
		System.out.println("O valor apresentado é positivo.");
		
		sc.close();
		
	}

}
