package quadro_funcionarios;

import java.text.NumberFormat;

public class Vendedor extends Funcionario {
	
	private float comissao;

	public Vendedor(String nome, int idade, int registro, String periodo, float salario, float comissao) {
		super(nome, idade, registro, periodo, salario);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public void visualizar() {
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		super.visualizar();
		System.out.println("O valor de Comissão é de R$: " + nfMoeda.format(this.comissao));
		
	}
	
	
}