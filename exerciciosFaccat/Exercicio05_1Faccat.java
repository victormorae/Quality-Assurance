package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio05_1Faccat {
	
	public static void main(String[] args) {

		try {
		
	Scanner sc = new Scanner(System.in);	
	System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		int resultado = valor + 1;
	System.out.println("O número sucessor do digitado anteriormente é: "+resultado);
		sc.close();
		
			}
	
		catch (Exception e)	{
			
	System.out.println("Valor inválido. Favor, insira um número correto " + e);
		
		}

	}

}
