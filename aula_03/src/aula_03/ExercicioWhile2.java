package aula_03;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, sexo = 0, categoria = 0, contador = 0, mulheresFrontend = 0, totalBackend = 0, homensMobile40 = 0, mulheresFullstack30 = 0;
		char continua = 'S';
		
		while(continua == 'S') {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o sexo (1-M / 2-F / 3-Outros: ");
			sexo = leia.nextInt();
			
			System.out.println("Digite a categoria (1-Backend / 2-Frontend / 3-Mobile / 4-FullStack): ");
			categoria = leia.nextInt();
			
			System.out.println("Deseja continuar? (S/N): ");
			continua = leia.next().toUpperCase().charAt(0);
			
			contador ++;
			
			if(sexo == 2 && categoria == 2)
				mulheresFrontend ++;
			
			if(categoria == 1)
				totalBackend ++;
			
			if(idade > 40 && sexo == 1 && categoria == 3)
				homensMobile40 ++;
			

			if(idade < 30 && sexo == 2 && categoria == 4)
				mulheresFullstack30 ++;
			
			}
		
		
			
			System.out.println("O número de pessoas desenvolvedoras Backend: " + totalBackend);
			System.out.println("O número de mulheres desenvolvedoras Frontend: " + mulheresFrontend);
			System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " + homensMobile40);
			System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulheresFullstack30);
			

		
		leia.close();

	}

}
