package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
	
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite seu Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o valor do Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite o valor das Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		System.out.println("O valor do seu Salário Líquido é de RS: " + df.format((salarioBruto + adicionalNoturno + (horasExtras * 5))-descontos));
		
		leia.close();

	}

}
