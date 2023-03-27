package farmacia;

import java.time.LocalDate;

public class TestaFarmacia {
	
	public static void main(String[] args) {
		
		LocalDate datap1 = LocalDate.of(2025, 9, 20);
		
		Farmacia p1 = new Farmacia ("Medley","Dipirona", false, datap1, 10.0f);
		p1.visualizar();
		
		LocalDate datap2 = LocalDate.of(2024, 8, 15);
		Farmacia p2 = new Farmacia ("Medley","Azitromicina", true, datap2, 25.0f);
		p2.visualizar();
		
		LocalDate datap3 = LocalDate.of(2030, 2, 01);
		Farmacia p3 = new Farmacia ("Johnson & Johnson","Sabonete", false, datap3, 40.0f);
		p3.visualizar();
		
		LocalDate datap4 = LocalDate.of(2024, 1, 05);
		Medicamento m1 = new Medicamento ("Biolab","Aradois", false, datap4, 52.2f, "Medicamentos");
		m1.visualizar();
		
		LocalDate datap5 = LocalDate.of(2024, 1, 05);
		Medicamento m2 = new Medicamento ("EMS","Losartana", false, datap5, 5.7f, "Medicamentos");
		m2.visualizar();
		
		LocalDate datap6 = LocalDate.of(2023, 12, 30);
		Perfumaria pe1 = new Perfumaria ("Nivea","Óleo Bifásico", false, datap6, 39.8f, "Perfumaria");
		pe1.visualizar();
		
		LocalDate datap7 = LocalDate.of(2030,10, 12);
		Perfumaria pe2 = new Perfumaria ("Galderma","Cethaphil", false, datap7, 109.8f, "Perfumaria");
		pe2.visualizar();
		
		
	}

}
