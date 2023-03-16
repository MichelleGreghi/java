package aula_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class SwitchExercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		String nome;
		double salario;
		int cargo;
		double novoSalario;
		
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Cargos");
		System.out.println("1\tGerente");
        System.out.println("2\tVendedor");
        System.out.println("3\tSupervisor");
        System.out.println("4\tMotorista");
        System.out.println("5\tEstoquista");
        System.out.println("6\tTécnico de TI");
        
        System.out.println("Digite seu Código de Colaborador: ");
        cargo = leia.nextInt();
		
        System.out.println("Digite o seu salário: ");
		salario = leia.nextDouble();
		
		 switch(cargo) {
	    	case 1:
	    		novoSalario = salario + (0.1 * salario);
	    		System.out.println("Nome do Colaborador: " + nome + "\nCargo: Gerente " + "\nSalário: " + nfMoeda.format(novoSalario));
	    	break;
	    	case 2:
	    		novoSalario = salario + (0.07 * salario);
	    		System.out.println("Nome do Colaborador: " + nome + "\nCargo: Vendedor " + "\nSalário: " + nfMoeda.format(novoSalario));
	        	break;
	    	case 3:
	    		novoSalario = salario + (0.09 * salario);
	    		System.out.println("Nome do Colaborador: " + nome + "\nCargo: Supervisor " + "\nSalário: " + nfMoeda.format(novoSalario));
	        	break;
	    	case 4:
	    		novoSalario = salario + (0.06 * salario);
	    		System.out.println("Nome do Colaborador: " + nome + "\nCargo: Motorista " + "\nSalário: " + nfMoeda.format(novoSalario));
	        	break;
	    	case 5:
	    		novoSalario = salario + (0.05 * salario);
	    		System.out.println("Nome do Colaborador: " + nome + "\nCargo: Estoquista " + "\nSalário: " + nfMoeda.format(novoSalario));
	        	break;
	    	case 6:
	    		novoSalario = salario + (0.08 * salario);
	    		System.out.println("Nome do Colaborador: " + nome + "\nCargo: Técnico de TI " + "\nSalário: " + nfMoeda.format(novoSalario));
	        	break;
	        default:
	        	System.out.println("Opção Inválida!");
	        
		
		
		
		
		
		leia.close();

		 }
	}
}
