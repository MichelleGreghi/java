package cliente.model;

public class PessoaJuridica extends Clientes {
	
	private String cnpj;

	public PessoaJuridica(String nome, int idade, String telefone, String cep, int estadoCivil, String cnpj) {
		super(nome, idade, telefone, cep, estadoCivil);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Pessoa Jurídica - CNPJ: " + this.cnpj);
		
	}
}
