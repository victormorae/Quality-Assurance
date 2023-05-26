/* Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10! 
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio14Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Apresente um valor: ");
		int valor = sc.nextInt();
		
		if (valor >= 11) {
			
			System.out.println("É MAIOR QUE 10!");
			
		} else
			
			System.out.println("NÃO É MAIOR QUE 10!");
			
			
		sc.close();
		
	}

}
