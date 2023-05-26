//Escreva  um  algoritmo  para  ler  o  número  total  de  eleitores  de um  município,  o  número  de  votos brancos, nulos e válidos.
//Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio08Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade total de eleitores de um município: ");
		int eleitores = sc.nextInt();

		System.out.println("Digite a quantidade total de eleitores que votaram em branco: ");
		int votosBrancos = sc.nextInt();

		System.out.println("Digite a quantidade total de eleitores que votaram em nulo: ");
		int votosNulos = sc.nextInt();

		System.out.println("Digite a quantidade total de eleitores que votaram válidos: ");
		int votosValidos = sc.nextInt();

		double percentualVotosBrancos = votosBrancos * 100/ eleitores;
		double percentualVotosNulo = votosNulos * 100/ eleitores;
		double percentualVotosValidos = votosValidos * 100/ eleitores;
		
		System.out.println("A porcentagem correspondente aos votos válidos é: "+ percentualVotosValidos+"%");
		System.out.println("A porcentagem correspondente aos votos nulos é: "+ percentualVotosNulo +"%");
		System.out.println("A porcentagem correspondente aos votos em branco é: "+ percentualVotosBrancos+"%");
	
		sc.close();
		
	}

}
