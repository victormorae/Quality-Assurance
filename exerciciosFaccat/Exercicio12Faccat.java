/*Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo): 

				C / 5 = ( F - 32 ) / 9
				
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio12Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a temperatura em Fahrenheit: ");
		
		double tempF = sc.nextDouble();
		double tempC = ((tempF - 32) / 9) * 5;
		
		System.out.println("O valor correspondente em Celsius é igual a: "+tempC);
		sc.close();
		
	}

}
