package cliente;

import java.util.Scanner;

import cliente.model.Clientes;
import cliente.model.PessoaFisica;
import cliente.model.PessoaJuridica;


public class Cliente {

	public Cliente(String nome, int idade, String telefone, String cep, int estadoCivil) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		Clientes c1 = new Clientes ("Fronzina Camargo", 30, "(12)92345-6528", "01234-566", 1);
		Clientes c2 = new Clientes ("Clotilde Maria", 18, "(11)2058-6235", "09876-543", 2);
		Clientes c3 = new Clientes ("Ariosvaldo Figueira", 69, "(11)96852-6895", "78532-160", 3);
						
		c1.visualizar();
		c2.visualizar();
		c3.visualizar();
		
		PessoaFisica pf1 = new PessoaFisica ("Richard Gomes", 47, "(11) 98563-2541", "02458-250", 2, "412.365.856-85");
		pf1.visualizar();
		
		PessoaFisica pf2 = new PessoaFisica ("Abelardo Monteiro", 22, "(11) 98547-3652", "14587-365", 1,"985.658.000-58");
		pf2.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica ("Zuleica Silva", 71, "(11)5214-6523", "02584-325", 3, "58.365.258/0001-95");
		pj1.visualizar();		
		
		PessoaJuridica pj2 = new PessoaJuridica ("Creuzodete Santos", 19, "(13)99985-3336", "12579-000",1, "45.123.854/0001-11");
		pj2.visualizar();	
		
		leia.close();

	}


}
