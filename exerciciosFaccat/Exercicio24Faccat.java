/* Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu salário total.
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio24Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salário fixo: ");
		double salarioFixo = sc.nextDouble();

		System.out.println("Digite o valor das vendas: ");
		double valorVendas = sc.nextDouble();

		double salarioTotal;

		if (salarioFixo < 0 || valorVendas < 0)
			System.out.println("Valor inválido, por favor tente novamente.");

		else if (valorVendas <= 1500.0) {
			salarioTotal = salarioFixo + (valorVendas * 0.03);
			System.out.println("Salário total: R$" + salarioTotal);

		} else {
			salarioTotal = salarioFixo + (valorVendas * 0.08);
			System.out.println("Salário total: R$" + salarioTotal);

		}

		sc.close();
		
	}

}
