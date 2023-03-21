package aula_03;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroInicial , numeroFinal;
		
		System.out.println("Informe o início do Intervalo: ");
		numeroInicial = leia.nextInt();
		
		System.out.println("Informe o final do Intervalo: ");
		numeroFinal = leia.nextInt();
		
		if(numeroInicial > numeroFinal) {
			System.out.println("Intervalo Inválido!");
			System.exit(0);
		}
		
		for(int contador = numeroInicial; contador <= numeroFinal; contador ++) {
			if (contador%3 == 0 && contador%5 == 0)
				System.out.println(contador +" é múltiplo de 5 e 3");
		}


		leia.close();
	}

}
