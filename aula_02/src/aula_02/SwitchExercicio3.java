package aula_02;

import java.util.Scanner;

public class SwitchExercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero1;
		double numero2;
		int opcao;
		double resultado;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Operação");
        System.out.println("1\tSoma");
        System.out.println("2\tSubtração");
        System.out.println("3\tMultiplicação");
        System.out.println("4\tDivisão");
     
        System.out.println("Digite a operação que quer realizar: ");
        opcao = leia.nextInt();
        
        switch(opcao) {
    	case 1:
    		resultado = numero1 + numero2;
    		System.out.println(numero1 + " + " + numero2 + " = " + resultado);
    	break;
    	case 2:
    		resultado = numero1 - numero2;
    		System.out.println(numero1 + " - " + numero2 + " = " + resultado);
    	break;
    	case 3:
    		resultado = numero1 * numero2;
    		System.out.println(numero1 + " * " + numero2 + " = " + resultado);
    	break;case 4:
    		resultado = numero1 / numero2;
    		System.out.println(numero1 + " / " + numero2 + " = " + resultado);
    	break;
    	default:
        	System.out.println("Opção Inválida!");
        	
    
        	leia.close();

        }
	}
}
