package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio09Faccatt {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o seu salário atual: ");
		float salario = sc.nextFloat();
		
		System.out.println("Entre com o percentual de reajuste: ");
		float reajuste = sc.nextFloat();
		float valorReajuste = reajuste * salario/100;
		float salarioNovo = valorReajuste + salario;
		
		System.out.printf("O novo salário com reajuste é: R$ %.2f",salarioNovo);
		
		sc.close();
	}

}
