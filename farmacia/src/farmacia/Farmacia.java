package farmacia;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Farmacia {
	
	private String fabricante; 
	private String nomeDoProduto;
	private boolean receita;
	private LocalDate dataValidade;
	private float preco;
	
	public Farmacia(String fabricante, String nomeDoProduto, boolean receita, LocalDate dataValidade,
			float preco) {
		this.fabricante = fabricante;
		this.nomeDoProduto = nomeDoProduto;
		this.receita = receita;
		this.dataValidade = dataValidade;
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}


	public boolean isReceita() {
		return receita;
	}

	public void setReceita(boolean receita) {
		this.receita = receita;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		System.out.println("******************************************\n");
		System.out.println("                   PRODUTOS                 ");
		System.out.println("\n******************************************");
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Nome do Produto: " + this.nomeDoProduto);
		System.out.println("Precisa de Receita: " + this.receita);
		System.out.println("Data de Validade: " + this.dataValidade.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
		);
		System.out.println("Preço: " + nfMoeda.format(this.preco));
	}
	
	

}
