/*Apresentar o total da soma obtida dos cem primeiros números inteiros
 * (1+2+3+4+...+98+99+100). */

package exerciciosManzano;

public class Exercicio01B_Manzano {

	public static void main(String[] args) {

		System.out.println("A soma dos cem primeiros números inteiros é igual a: ");

		int contador = 1;
		int soma = 0;

		while (contador < 101) {

			soma = soma + contador;
			contador++;

		}

		System.out.println(soma);
	}

}