package aula_03;

import java.util.Scanner;

public class ExercicioDoWhile2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero = 0, contador = 0, soma = 0; 

		
		do {	
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
			soma += numero;
			contador ++;
			}
			
		}while (numero != 0);
	
			
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + (soma/contador));
		
		leia.close();

	}

}
