/*  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
 */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio21Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o horário de início do jogo: ");

		int horaInicio = sc.nextInt();

		System.out.println("Digite o horário do fim do jogo: ");

		int horaFim = sc.nextInt();
		int quantidadeDeHorasJogadas = horaFim - horaInicio;

		if (quantidadeDeHorasJogadas < 0) {

			int totalHoras = quantidadeDeHorasJogadas + 24;

			System.out.println("Quantidade de horas jogadas é: " + totalHoras);

		} else {

			System.out.println("Quantidade de horas jogadas é: " + quantidadeDeHorasJogadas);

		}

		sc.close();

	}

}