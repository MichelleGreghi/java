package aula_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class SwitchExercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		int produto;
		int quantidade;
		double preco;
		
		System.out.println("Produtos");
        System.out.println("1\tCachorro Quente" + " Preço R$ 10,00");
        System.out.println("2\tX-Salada" + " Preço R$ 15,00");
        System.out.println("3\tX-Bacon" + " Preço R$ 18,00");
        System.out.println("4\tBauru" + " Preço R$ 12,00");
        System.out.println("5\tRefrigerante" + " Preço R$ 8,00");
        System.out.println("6\tSuco de Latanja" + "Preço R$ 13,00");
        
        System.out.println("Digite o Código do Produto: ");
        produto = leia.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade = leia.nextInt();
        
        switch(produto) {
    	case 1:
    		preco = quantidade * 10.00;
    		System.out.println("Produto: Cachorro Quente - Valor Total R$: " + nfMoeda.format(preco));
    	break;
    	case 2:
    		preco = quantidade * 15.00;
    		System.out.println("Produto: X-Salada - Valor Total: " +  nfMoeda.format(preco));
        	break;
    	case 3:
    		preco = quantidade * 18.00;
    		System.out.println("Produto: X-Bacon - Valor Total: " + nfMoeda.format(preco));
        	break;
    	case 4:
    		preco = quantidade * 12.00;
    		System.out.println("Produto: Bauro - Valor Total: " +  nfMoeda.format(preco));
        	break;
    	case 5:
    		preco = quantidade * 8.00;
    		System.out.println("Produto: Refrigerante - Valor Total: " +  nfMoeda.format(preco));
        	break;
    	case 6:
    		preco = quantidade * 13.00;
    		System.out.println("Produto: Suco de Laranja - Valor Total: " +  nfMoeda.format(preco));
        	break;
        default:
        	System.out.println("Opção Inválida!");
        
        
        
        
		
		leia.close();

        }
       }
}
