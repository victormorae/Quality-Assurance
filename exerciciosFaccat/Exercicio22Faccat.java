/* A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas).
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio22Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de horas trabalhadas em um mês: ");
		int horasTrabalhadas = sc.nextInt();

		System.out.println("Digite o salário por hora: ");
		double salarioHora = sc.nextDouble();
		double salarioTotal;
		double horaExtra = horasTrabalhadas - 160;

		if (horasTrabalhadas < 160)
			System.out.println("Número de horas inválido, por favor insira um número válido.");

		else if (horasTrabalhadas == 160) {
			salarioTotal = salarioHora * horasTrabalhadas;
			System.out.println("Salário total: R$" + salarioTotal);

		} else {
			salarioTotal = ((horaExtra * 1.5) + horasTrabalhadas) * salarioHora;
			System.out.println("Salário total: R$" + salarioTotal);
			System.out.println("O salário foi aumentado devido as " + horaExtra + " horas extras trabalhadas, bom trabalho.");

		}

		sc.close();

	}

}
