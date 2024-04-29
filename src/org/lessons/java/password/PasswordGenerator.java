package org.lessons.java.password;

public class PasswordGenerator {
	
	// metodo che userò per generare la password
	public static String generoPassword(Utente utente) {
	String nome = utente.getNome();
	String cognome = utente.getCognome();
	String colore = utente.getColorePreferito();
	String dataDiNascita = utente.getDataDiNascita();
	
	// nella password la data di nascita deve venire fuori sommata, cioè giorno + mese + anno, quindi separo le parti quando trova / e sommo quelle parti:
	String[] partiData = dataDiNascita.split("/");
	int giorno = Integer.parseInt(partiData[0]);
	int mese = Integer.parseInt(partiData[1]);
	int anno = Integer.parseInt(partiData[2]);
	
	int somma = giorno + mese + anno;
	
	// compongo la password:
	String password = nome + "-" + cognome + "-" + colore + "-" + somma;
	return password;
	}
}
