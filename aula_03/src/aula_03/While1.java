package aula_03;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, contador = 0, menorIdade21 = 0, maiorIdade50 = 0;
		
		
			while(idade > -1) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			contador ++;
			
			if( idade < 21 && idade > 0)
				menorIdade21 ++;
			
			if (idade > 50)
				maiorIdade50 ++;
		}
			
			System.out.println("Total de pessoas menores de 21 anos: " + menorIdade21);
			System.out.println("Total de pessoas maiores de 50 anos: " + maiorIdade50);
		
		leia.close();

	}

}
