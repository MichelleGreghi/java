package cliente.model;


public class PessoaFisica extends Clientes  {
	
	private String cpf;

	public PessoaFisica(String nome, int idade, String telefone, String cep, int estadoCivil,String cpf) {
		super(nome, idade, telefone, cep, estadoCivil);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Pessoa Física - CPF: " + this.cpf);
		
	}
	
	

}
