package it.isprambiente.test.Libretto.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Libretto dello studente
 * 
 * @author rvent
 *
 */
public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public String toString() {
		String s = "";
		for(Voto v: this.voti) {
			s = s + v.toString() + "\n";
		}
		return s;
		
	}
}
