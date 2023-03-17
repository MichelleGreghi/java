package aula_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class SwitchExercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		float saldo = 1000;
		float saque;
		float deposito;
		int opcao;
		
		System.out.println("Transições Bancárias");
        System.out.println("1\tSaldo");
        System.out.println("2\tSaque");
        System.out.println("3\tDepósito");
        
        System.out.println("Digite a opção desejada: ");
        opcao = leia.nextInt();
        
        switch (opcao) {
		case 1: 
			System.out.println("Seu saldo é de " + nfMoeda.format(saldo));
		break;
		case 2:
			System.out.println("Qual valor do saque? ");
			saque = leia.nextFloat();
			if(saldo > saque) {
			saldo -= saque;
			System.out.println("Seu saldo é de " + nfMoeda.format(saldo));
			}
				else System.out.println("Saldo Insuficiente!");
		break;
		case 3:
			System.out.println("Qual valor do depósito? ");
			deposito = leia.nextFloat();
			saldo += deposito;
			System.out.println("Seu saldo é de " + nfMoeda.format(saldo));
		break;
		default:
			System.out.println("Opção Inválida!");
		}
       
           	
           	leia.close();
		
		
        }
	}


