package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	List<String> lista;	
	public Parole() {
		//TODO
		lista=new LinkedList<String>();
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
    
	public void cancella(String s) {
		for(String ss:lista) 
			if(ss.equals(s))
				lista.remove(s);	
	}
}


