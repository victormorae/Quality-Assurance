/*Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
final é: 
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio13Faccat {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe a primeira nota do aluno: ");
			float n1 = sc.nextFloat();
			
			System.out.println("Informe a segunda nota do aluno: ");
			float n2 = sc.nextFloat();
			
			System.out.println("Informe a terceira nota do aluno: ");
			float n3 = sc.nextFloat();
		
			float mediaFinal = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

			
			if (n1 < 0|| n2 < 0 || n3 < 0 || n1 > 10|| n2 > 10 || n3 > 10) {
			
			System.out.println("Erro! As notas apresentadas devem ser entre 0 e 10.");	
			
			}	else 
			System.out.println("A média final do aluno é igual a: "+mediaFinal);
			
			sc.close();

		} catch (Exception e) {

			System.out.println("Erro! Caractere inválido "+e);
			
		}
		
	}

}
