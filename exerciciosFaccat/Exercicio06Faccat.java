//Escreva  um  algoritmo  para  ler  as  dimensões  de  um  retângulo  (base  e  altura),  calcular  e  escrever  a área do retângulo. 

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio06Faccat {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Insira o valor da base do retângulo: ");
			double base = sc.nextInt();

			System.out.println("Insira o valor da altura do retângulo: ");
			double altura = sc.nextInt();
			if (base == altura) {
				System.out.println("Você digitou valores iguais. Favor, digite valores distintos.");
			}

			else {
				double area = base * altura;

				System.out.println("A área do retângulo é igual a: " + area);
				sc.close();
			}

		} catch (Exception e) {

			System.out.println("Valor inválido, tente novamente inserindo um número correto " + e);

		}

	}

}
