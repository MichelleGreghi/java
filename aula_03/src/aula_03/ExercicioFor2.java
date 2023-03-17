package aula_03;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, numPar = 0, numImpar = 0;
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.println("Digite o " + contador  + " número ");
			numero = leia.nextInt();
			
			
			if(numero % 2 == 0) {
				numPar ++;
			} else 
				numImpar ++;
			}
		System.out.println("Total de números pares: " + numPar);
		System.out.println("Total de números ímpares: " + numImpar);
		}


	}

