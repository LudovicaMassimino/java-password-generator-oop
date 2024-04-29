package org.lessons.java.password;

public class Utente {
	String nome;
	String cognome;
	String dataDiNascita;
	String colorePreferito;
	
	//costruttore
	public Utente(String nome, String cognome, String dataDiNascita, String colorePreferito) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.colorePreferito = colorePreferito;
	}
	//metodi per usare gli attributi
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getDataDiNascita() {
		return dataDiNascita;
	}
	
	public String getColorePreferito() {
		return colorePreferito;
	}
}
