package org.lessons.java.security;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // classe scanner
        Scanner input = new Scanner(System.in);

        // richiesta nome
        System.out.println("");
        System.out.println("Scrivi il tuo nome: ");
        String nome = input.nextLine();

        // richiesta cognome
        System.out.println("Scrivi il tuo cognome: ");
        String cognome = input.nextLine();

        // richiesta colore
        System.out.println("Scrivi il tuo colore preferito: ");
        String colore = input.nextLine();

        // richiesta data di nascita
        System.out.println("Scrivi il giorno della tua data di nascita (gg): ");
        int giorno = input.nextInt();

        System.out.println("Scrivi il mese della tua data di nascita (mm): ");
        int mese = input.nextInt();

        System.out.println("Scrivi l'anno della tua data di nascita (aaaa): ");
        int anno = input.nextInt();
        
        int somma = giorno + mese + anno;

        // elaborazione password
        String password = nome + "-" + cognome + "-" + colore + "-" + somma;
        Random numeroRandom = new Random();
        int max = 100000;
        int risultato = numeroRandom.nextInt(max);
        System.out.println("La tua password personalizzata è: " + password);
        System.out.println("Vuoi una password più sicura? Puoi usare la seguente: " + password + "-" + risultato);
    }
}
