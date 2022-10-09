package it.isprambiente.test.Libretto.model;

import java.time.LocalDate;

public class TestLibretto {
	
	public static void main(String[] args ) {

		Libretto libretto = new Libretto();
		
		System.out.println("Test metodi libretto");
			
		Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2022,2,15));
		Voto voto2 = new Voto("Fisica 1", 30, LocalDate.of(2022,2,15));
		Voto voto3 = new Voto("Analisi 2", 30, LocalDate.of(2022,2,15));
		Voto voto4 = new Voto("Informatica 1", 30, LocalDate.of(2022,2,15));
		
		libretto.add(voto1);
		libretto.add(voto2);
		libretto.add(voto3);
		libretto.add(voto4);
	
		System.out.println(libretto);
	}
	
}
