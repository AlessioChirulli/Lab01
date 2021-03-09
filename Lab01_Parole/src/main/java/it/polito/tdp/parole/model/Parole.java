package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Parole {
	List<String> lista;	
	public Parole() {
		//TODO
		lista=new ArrayList<String>();
	}
	
	public void addParola(String p) {
		lista.add(p);
	}
	public List<String> getElenco() {
		List<String>copia=lista;
		Collections.sort(copia);
		return copia;
	}
	
	public void reset() {
		lista.clear();
	}

}


