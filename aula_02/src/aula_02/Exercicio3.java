package aula_02;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome, pergunta;
		int idade;
		boolean doacao = false;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a sua idade: ");
        idade = leia.nextInt();
        
        System.out.println("Primeira Doação de Sangue? (S/N) ");
        pergunta = leia.next().toUpperCase();
        
        if (pergunta == "S")
        doacao = true;
        
        if(idade >= 60 && idade <= 69) {
        	if (doacao)
        		System.out.println("Sr(a) " + nome + " você não está apto(a)para doar sangue!");
        	else
        		System.out.println("Sr(a) " + nome + " você está apto(a)para doar sangue!");
        }else if(idade < 18 || idade > 69)
        	System.out.println("Sr(a) " + nome + " você não está apto(a)para doar sangue!");
        else
        	System.out.println("Sr(a) " + nome + " você está apto(a)para doar sangue!");
        		
		
		leia.close();

	}
}
