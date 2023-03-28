package exercicio03;

import java.time.LocalDate;

public class TestaGame {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2020, 9, 20);
		Produto g1 = new Produto(1, "Valorant", 1, "Riot Games", data, 1200.0f);
		g1.visualizar();
		
		LocalDate data2 = LocalDate.of(2021, 8,21);
		Console cs1 = new Console (1, "X-Box 360", 2, "Microsoft", data2, 5000.0f, 1);
		cs1.visualizar();
		
	}

}
