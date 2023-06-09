package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
        String titular;
        float saldo, limite, valor;
        
        ContaController contas = new ContaController();  
         
		while(true) {
			
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND +"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar Todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Número              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir Valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a Opção Desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();		
			}catch(InputMismatchException e){
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
				
			}
			if(opcao == 9) {
				sobre();
				System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + "\nBanco do Brazil com Z - O Seu Futuro Começa Aqui!");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1: System.out.println("Criar Conta\n\n");
			
			System.out.println("Digite o Numero da Agência: ");
            agencia = leia.nextInt();
            System.out.println("Digite o Nome do Titular: ");
            leia.skip("\\R?");
            titular = leia.nextLine();

            do {
                System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
                tipo = leia.nextInt();
            } while (tipo < 1 && tipo > 2);

            System.out.println("Digite o Saldo da Conta (R$): ");
            saldo = leia.nextFloat();

            switch (tipo) {
            case 1 -> {
                System.out.println("Digite o Limite de Crédito (R$): ");
                limite = leia.nextFloat();

                contas.cadastar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
            }
            case 2 -> {
                System.out.println("Digite o dia do Aniversario da Conta: ");
                aniversario = leia.nextInt();

                contas.cadastar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
            }
            }
            keyPress();
			break;			
			case 2: System.out.println("Listar Todas as Contas\n\n");
			contas.listarTodas();
			keyPress();
			break;
			case 3: System.out.println("Consultar Dados da Conta - Por Número\n\n");
			
			System.out.println("Digite o número da conta: ");
            numero = leia.nextInt();
            contas.procurarPorNumero(numero);
            
            keyPress();
			break;
			case 4: System.out.println("Atualizar Dados da Conta\n\n");
			
			System.out.println("Digite o número da conta: ");
            numero = leia.nextInt();

            tipo = 1;
            // condicional buscar na collection

            System.out.println("Digite o Numero da Agência: ");
            agencia = leia.nextInt();
            System.out.println("Digite o Nome do Titular: ");
            leia.skip("\\R?");
            titular = leia.nextLine();

            System.out.println("Digite o Saldo da Conta (R$): ");
            saldo = leia.nextFloat();

            // retornar tipo

            switch (tipo) {
            case 1 -> {
                System.out.println("Digite o Limite de Crédito (R$): ");
                limite = leia.nextFloat();

                // criar o objeto conta corrente
            }
            case 2 -> {
                System.out.println("Digite o dia do Aniversario da Conta: ");
                aniversario = leia.nextInt();

                // criar o objeto conta poupanca

            }
            default -> {
                System.out.println("Tipo de conta inválido!");
            }
            }

            // fim do condicional buscar na collection
            keyPress();
			break;
			case 5: System.out.println("Apagar a Conta\n\n");
			
			System.out.println("Digite o número da conta: ");
            numero = leia.nextInt();
            keyPress();
			break;
			case 6: System.out.println("Saque\n\n");
			
			System.out.println("Digite o número da conta: ");
            numero = leia.nextInt();
            
            System.out.println("Digite o valor do saque: ");
            valor = leia.nextFloat();
            keyPress();
			break;
			case 7: System.out.println("Depósito\n\n");
			
			System.out.println("Digite o número da conta: ");
            numero = leia.nextInt();
            
            System.out.println("Digite o valor do depósito: ");
            valor = leia.nextFloat();
            keyPress();
			break;
			case 8: System.out.println("Transferência entre Contas\n\n");
			
			System.out.println("Digite o Numero da Conta de Origem: ");
            numero = leia.nextInt();
            System.out.println("Digite o Numero da Conta de Destino: ");
            numeroDestino = leia.nextInt();

            do {
                System.out.println("Digite o Valor da Transferência (R$): ");
                valor = leia.nextFloat();
            } while (valor <= 0);
            keyPress();
			break;
			default: System.out.println("\nOpção Inválida!\n");
			keyPress();
			break;
			}
		}

		
	}

	public static void sobre() {
		
		System.out.println("   \nE-mail: michelle.neves23@gmail.com   ");
		System.out.println("GitHub: https://github.com/MichelleGreghi");
		System.out.println("           Michelle Greghi\n             ");
	}
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "Pressione a tecla enter para continuar ...");
			System.in.read();
		}catch (IOException e) {
			System.out.println("Erro de Digitação!");
		}
	}
	
}
