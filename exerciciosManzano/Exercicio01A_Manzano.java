/*Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10)
de um número qualquer. 
*/

package exerciciosManzano;

import java.util.Scanner;

public class Exercicio01A_Manzano {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para ser feita a tabuada: ");
		int valorInicial = sc.nextInt();
		int contador = 1;

		while (contador < 11) {

			System.out.println(valorInicial + " x " + contador + " = " + (valorInicial * contador));
			contador++;

		}

		sc.close();

	}

}	