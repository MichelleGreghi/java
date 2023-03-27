package farmacia;

import java.time.LocalDate;

public class Perfumaria extends Farmacia {
	
	private String perfumaria;

	public Perfumaria(String fabricante, String nomeDoProduto, boolean receita, LocalDate dataValidade, float preco,
			String perfumaria) {
		super(fabricante, nomeDoProduto, receita, dataValidade, preco);
		this.perfumaria = perfumaria;
	}

	public String getPerfumaria() {
		return perfumaria;
	}

	public void setPerfumaria(String perfumaria) {
		this.perfumaria = perfumaria;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Esse item se encontra na parte de: " + this.perfumaria);
		
	}

	

}
