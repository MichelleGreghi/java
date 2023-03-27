package quadro_funcionarios;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private int idade;
	private int registro;
	private String periodo;
	private float salario;
	
	public Funcionario(String nome, int idade, int registro, String periodo, float salario) {
		this.nome = nome;
		this.idade = idade;
		this.registro = registro;
		this.periodo = periodo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public String getSalario() {
		return periodo;
	}

	public void setSalario(String periodo) {
		this.periodo = periodo;
	}
	
	
	public void visualizar() {
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		System.out.println("******************************************\n");
		System.out.println("             QUADRO DE FUNCIONÁRIOS         ");
		System.out.println("\n******************************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Numero de Registro: " + this.registro);
		System.out.println("Período: " + this.periodo);
		System.out.println("Salário: " + nfMoeda.format(this.salario));
	}
	

	
}
