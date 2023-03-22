package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);	
		
		int opcao;
		
		do {

			System.out.println("1- Adicionar um novo livro na pilha");
			System.out.println("2- Listar todos os livros da Pilha");
			System.out.println("3- Retirar um livro da pilha");
			System.out.println("0- Sair");

			opcao = leia.nextInt();
			
			switch (opcao) {

			case 1:
				System.out.println("Adicionar um novo livro na pilha");
				System.out.println("Digite o nome do livro: ");
				leia.skip("\\R?");
				pilha.push(leia.nextLine());
				System.out.println("\nLivro Adicionado!\n");
			
				
				break;
			case 2:
				System.out.println("Listas de Livros na Pilha: \n");
				
				for(var clientes : pilha)
				System.out.println(clientes);
				
				
				break;
			case 3:
				
				if(pilha.isEmpty()) {
					System.out.println("\nPilha Vazia!\n");
				
				}else {
					
					pilha.pop();
				System.out.println("Pilha: \n");
				System.out.println(pilha);
				System.out.println("\nUm Livro foi retirado da pilha!\n");
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
