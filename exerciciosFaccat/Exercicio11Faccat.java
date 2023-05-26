/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio11Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número de carros vendidos: ");
		int vendidos = sc.nextInt();
		
		System.out.println("Informe o valor total de suas vendas: ");
		double totalVendas = sc.nextDouble();
		
		System.out.println("Infome o seu salário fixo: ");
		double salario = sc.nextDouble();
		
		System.out.println("Escreva o valor que recebe por carro vendido: ");
		double valorPorCarro = sc.nextDouble();
		
		double bonusPercentual = totalVendas*0.05;
		double bonusPorCarro = vendidos * valorPorCarro;
		double salarioFinal = salario + bonusPorCarro + bonusPercentual;
		
		System.out.println("Seu salário final é: R$"+salarioFinal);
		sc.close();
		
	}

}
