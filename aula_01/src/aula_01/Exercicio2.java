package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.0");
		
		Scanner leia = new Scanner(System.in);
		
	
		float nota1, nota2, nota3, nota4;
		
		
		System.out.println("Digite sua nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite sua nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite sua nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite sua nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("A sua média é de " + df.format((nota1 + nota2 + nota3 + nota4)/4));
		
		leia.close();
		
	}

}
