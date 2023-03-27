package cliente.model;

public class Clientes {
	
	private String nome;
	private int idade;
	private String telefone;
	private String cep;
	private int estadoCivil;
	
	public Clientes(String nome, int idade, String telefone, String cep, int estadoCivil) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.cep = cep;
		this.estadoCivil = estadoCivil;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String cpf) {
		this.telefone = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
public void visualizar() {
		
		String estadoCivil = "";
		
		switch(this.estadoCivil ) {
		case 1 -> estadoCivil = "Casado(a)";
		case 2 -> estadoCivil = "Solteiro(a)";
		case 3 -> estadoCivil = "Viúvo(a)";
		}
		System.out.println("******************************************");
		System.out.println("              DADOS DA CLIENTE              ");
		System.out.println("******************************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("CEP: " + this.cep);
		}
	
	
	

}
