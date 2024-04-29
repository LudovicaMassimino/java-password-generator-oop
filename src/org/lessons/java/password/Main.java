package org.lessons.java.password;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// chiedo all'utente di inserire i dati che mi servono per la password:
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il tuo nome: ");
		String nome = input.nextLine();
		System.out.print("Inserisci il tuo cognome: ");
		String cognome = input.nextLine();
		System.out.print("Inserisci il tuo colore preferito: ");
		String colorePreferito = input.nextLine();
		System.out.print("Inserisci la tua data di nascita: ");
		String dataDiNascita = input.nextLine();
		
		// creo l'oggetto utente:
		Utente utente = new Utente(nome, cognome, dataDiNascita, colorePreferito);
		
		// genero la password:
		String password = PasswordGenerator.generoPassword(utente);
		System.out.println("La tua nuova password è: " + password);
	}

}
