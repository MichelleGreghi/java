package aula_04;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[10];
		float  soma = 0, media = 0;
		
		for(int contador = 0; contador < vetor.length; contador ++) {
			System.out.println("Digite um valor para a posição[" + contador + "]: ");
			vetor[contador] = leia.nextInt();					
		}	
		
		System.out.println("Elementos Pares: ");
		for(int contador = 0; contador < vetor.length; contador ++) {
			if(contador % 2 == 0 && contador != 0) {
				System.out.println(contador);

			}
		}	
		
		System.out.println("Elementos de índices ímpares: ");
		for (int contador = 0; contador < vetor.length; contador++) {
			if (contador % 2 != 0) {
				System.out.println(vetor[contador]);

			}
		}
		
		for (int contador = 0; contador < vetor.length; contador++) {	
		soma += vetor[contador];
		media = soma/10;
		}
		
		System.out.println("SOMA: " + soma);
		System.out.println("Média: " + media);
		
		
		leia.close();

	}

}
