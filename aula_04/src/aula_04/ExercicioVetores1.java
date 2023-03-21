package aula_04;

import java.util.Scanner;

public class ExercicioVetores1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		
		for(int contador = 0; contador < vetor.length; contador ++) {
			if (numero > 10) {
				System.out.println("O número " + numero + " não foi encontrado!");
				break;
			}
			
			if(vetor[contador] == numero) {
			System.out.println("O número " + numero + " está localizado na posição: " + contador);
			}
		}
		
		leia.close();

	}

}
