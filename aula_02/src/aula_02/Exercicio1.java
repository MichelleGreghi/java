package aula_02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroA, numeroB, numeroC;
		
		System.out.println("Digite o número A: ");
		numeroA = leia.nextInt();
		System.out.println("Digite o número B: ");
		numeroB = leia.nextInt();
		System.out.println("Digite o número C: ");
		numeroC = leia.nextInt();
		
		if ((numeroA + numeroB) > numeroC)
			System.out.println("A Soma de A + B é Maior do que C");
		else if ((numeroA + numeroB) < numeroC)
			System.out.println("A Soma de A + B é Menor do que C");
		else if ((numeroA + numeroB) == numeroC)
			System.out.println("A Soma de A + B é Igual a C");
		
		leia.close();
	}

}
