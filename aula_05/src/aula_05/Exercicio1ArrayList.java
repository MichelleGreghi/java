package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1ArrayList {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();
		
		System.out.println("Por favor digite o nome de 5 cores individualmente:");
		for(int quantidade = 0; quantidade <= 4; quantidade ++) {
		cores.add(leia.nextLine());
		}
		
		System.out.println("\nListar todas as cores: \n");
		for(var listar : cores)
			System.out.println(listar);
		
		cores.sort(null);
		System.out.println("\nOrdenar as cores: \n");
		for(var ordenar : cores)
			System.out.println(ordenar);
		
		leia.close();

	}

}
