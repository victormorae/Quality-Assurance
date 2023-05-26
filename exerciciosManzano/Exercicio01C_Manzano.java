/* Elaborar um programa que apresente no final o somatório dos valores pares
 * existentes na faixa de 1 até 500. */

package exerciciosManzano;

public class Exercicio01C_Manzano {

	public static void main(String[] args) {

		System.out.println("O somatório dos valores pares existentes na faixa de 1 até 500 é: ");

		int contador = 1, soma = 0;

		while (contador < 501) {

			if (contador % 2 == 0) {

				soma = contador + soma;
				contador++;
			}

			else
				contador++;

		}
		
		System.out.println(soma);
		
	}

}