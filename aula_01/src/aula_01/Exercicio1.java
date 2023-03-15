package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o salário atual: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		System.out.println("O novo salário de " + nome + " é no valor de: R$ " + df.format(salario + abono));
		
		leia.close();
	}

}
