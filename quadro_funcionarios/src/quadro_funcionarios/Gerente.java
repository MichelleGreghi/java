package quadro_funcionarios;

import java.text.NumberFormat;

public class Gerente extends Funcionario{
	
	private float bonificacao;

	public Gerente(String nome, int idade, int registro, String periodo, float salario, float bonificacao) {
		super(nome, idade, registro, periodo, salario);
		this.bonificacao = bonificacao;
	}

	public float getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(float bonificacao) {
		this.bonificacao = bonificacao;
	}

	public void visualizar() {
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		super.visualizar();
		System.out.println("O valor de Bonificação é de R$: " + nfMoeda.format(this.bonificacao));
		
	}
}
