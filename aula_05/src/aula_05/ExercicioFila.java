package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao;
		
		do {

			System.out.println("1- Adicionar Cliente na Fila");
			System.out.println("2- Listar todos os Clientes na fila");
			System.out.println("3- Chamar uma pessoa da fila ");
			System.out.println("0- Sair");

			opcao = leia.nextInt();
			
			switch (opcao) {

			case 1:
				System.out.println("Adicionar Cliente na Fila");
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				fila.add(leia.nextLine());
				System.out.println("\nCliente Adicionado!\n");
			
				
				break;
			case 2:
				System.out.println("Lista de Clientes na Fila: ");
				
				for(var clientes : fila)
				System.out.println(clientes);
				
				
				break;
			case 3:
				System.out.println("Fila:  \n");
				
				if(fila.isEmpty()) {
					System.out.println("Fila Vazia!");
				
				}else {
					fila.poll();
				System.out.println(fila);
				System.out.println("\nO Cliente Foi Chamado!");
				}
				break;
	
			default:
				if(opcao == 0)
					System.out.println("Programa Finalizado!");
			}

		
				
		}while (opcao < 4);
			System.out.println("Opção Inválida!");

		leia.close();

		}
		
	}
	



