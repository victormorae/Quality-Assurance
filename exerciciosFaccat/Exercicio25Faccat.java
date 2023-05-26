/* Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. 
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio25Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número da conta: ");
		int numeroConta = sc.nextInt();

		System.out.println("Digite o saldo: ");
		double saldo = sc.nextDouble();

		System.out.println("Digite o débito: ");
		double debito = sc.nextDouble();

		System.out.println("Digite o crédito: ");
		double credito = sc.nextDouble();
		double saldoAtual = saldo - debito + credito;

		if (saldoAtual >= 0.0) {

			System.out.println("O saldo da conta " + numeroConta + " é: R$" + saldoAtual);
			System.out.println("Saldo Positivo");

		}

		else {

			System.out.println("O saldo da conta " + numeroConta + " é: R$" + saldoAtual);
			System.out.println("Saldo Negativo");

		}

		sc.close();

	}

}
