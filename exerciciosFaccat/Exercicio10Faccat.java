/*  O  custo  de  um  carro  novo  ao  consumidor  é  a  soma  do  custo  de  fábrica  com  a  porcentagem  do
 * distribuidor e dos impostos (aplicados ao custo de fábrica).
 * Supondo que o percentual do distribuidor seja  de  28%  e  os  impostos  de  45%, escrever  um  algoritmo
 * para  ler o  custo  de  fábrica  de  um  carro, calcular e escrever o custo final ao consumidor. 
 */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio10Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o custo de fábrica do carro: ");
		double custoFabrica = sc.nextDouble();
		double distribuidor = custoFabrica * 0.28;
		double impostos = custoFabrica * 0.45;
		double custoFinal = custoFabrica + distribuidor + impostos;

		System.out.println("O custo final do carro é R$" + custoFinal);

		sc.close();

	}

}
