package farmacia;

import java.time.LocalDate;

public class Medicamento extends Farmacia {

	private String medicamento;

	public Medicamento(String fabricante, String nomeDoProduto, boolean receita, LocalDate dataValidade, float preco,
			String medicamento) {
		super(fabricante, nomeDoProduto, receita, dataValidade, preco);
		this.medicamento = medicamento;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	

	public void visualizar() {
		super.visualizar();
		System.out.println("Esse item se encontra na parte de: " + this.medicamento);
		
	}

}
