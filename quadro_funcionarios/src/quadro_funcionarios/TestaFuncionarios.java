package quadro_funcionarios;

public class TestaFuncionarios {

	public static void main(String[] args) {
		
		
		
		Funcionario f1 = new Funcionario ("Josevaldo Martins", 32, 1234, "Manhã", 10000.0f);
		f1.visualizar();
		
		Funcionario f2 = new Funcionario ("Jurema Rocha", 24, 4321, "Tarde", 20000.0f);
		f2.visualizar();
		
		Vendedor v1 = new Vendedor ("Clarice Lispector", 52, 2589, "Integral", 7000.0f, 6000.0f);
		v1.visualizar();
		
		Vendedor v2 = new Vendedor ("Monteiro Lobato", 21, 8547, "Noite", 7000.0f, 3000.0f);
		v2.visualizar();
		
		Gerente g1 = new Gerente ("Maurício de Souza", 52, 11258, "Integral", 15000.0f, 5000.0f);
		g1.visualizar();
		
		Gerente g2 = new Gerente ("Cecília Meireles", 30, 12058, "Integral", 20000.0f, 7000.0f);
		g2.visualizar();
		

	}

}
