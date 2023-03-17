package aula_03;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, contador = 0, soma = 0;
		
				
		do {	
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0)
			soma = numero + soma;
			contador ++;
		}while (numero != 0);
		
		System.out.println("A soma dos números é: " + soma);
		
		leia.close();

	}

}
