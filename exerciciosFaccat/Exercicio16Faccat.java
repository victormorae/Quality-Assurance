/*As  maçãs  custam  R$  1,30  cada  se  forem  compradas  menos  de  uma  dúzia, e  R$  1,00  se  forem compradas
 * pelo  menos  12. Escreva  um  programa  que  leia  o  número  de  maçãs  compradas,
 * calcule  e escreva o custo total da compra.
 */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio16Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o número de maçãs compradas:");
		int macas = sc.nextInt();
		
		if (macas >= 12) {
			
		double preco = 1.00;
		double precoTotal = macas*preco;
		
		System.out.println("O custo total da compra é: R$"+precoTotal);
			
		} else {
			
		double preco = 1.30;
		double precoTotal = macas*preco;
		
		System.out.println("O custo total da compra é: R$"+precoTotal);
			
		}

		sc.close();
		
	}

}
