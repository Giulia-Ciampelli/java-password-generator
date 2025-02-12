// Il programma deve fare quanto segue:
// - Salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
// - Generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -

// Esempio:
// Ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta. La sua password sarà Pinco-Pallo-magenta-2011

package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        
        // classe scanner
        Scanner input = new Scanner(System.in);

        // richiesta nome
        System.out.println("");
        System.out.println("Scrivi il tuo nome: ");
        String nome = input.nextLine();
        System.out.println("Il tuo nome è: " + nome);

        // richiesta cognome
        System.out.println("Scrivi il tuo cognome: ");
        String cognome = input.nextLine();
        System.out.println("Il tuo cognome è: " + cognome);

        // richiesta colore
        System.out.println("Scrivi il tuo colore preferito: ");
        String colore = input.nextLine();
        System.out.println("Il tuo colore preferito è: " + colore);

        // richiesta data di nascita
        System.out.println("Scrivi il giorno della tua data di nascita (gg): ");
        int giorno = input.nextInt();
        System.out.println("Il giorno della tua data di nascita è: " + giorno);

        System.out.println("Scrivi il mese della tua data di nascita (mm): ");
        int mese = input.nextInt();
        System.out.println("Il mese della tua data di nascita è: " + mese);

        System.out.println("Scrivi l'anno della tua data di nascita (aaaa): ");
        int anno = input.nextInt();
        System.out.println("L'anno della tua data di nascita è: " + anno);

        System.out.println("La tua data di nascita completa è: " + giorno + "-" + mese + "-" + anno);
    }
}
