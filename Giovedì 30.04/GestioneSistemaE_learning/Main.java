package GestioneSistemaE_learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //otteniamo l'istanza del gestore notifiche
        GestoreNotifiche gestore = GestoreNotifiche.getInstance();

        //variabile per controllare il ciclo del menu
        boolean continua = true;

        while (continua) {
            System.out.println("\n--- MENU SISTEMA E-LEARNING ---");
            System.out.println("1. Iscriviti alle notifiche");
            System.out.println("2. Disiscriviti dalle notifiche");
            System.out.println("3. Invia notifica a tutti gli iscritti");
            System.out.println("4. Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); 

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il tuo nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci la tua email: ");
                    String email = scanner.nextLine();
                    Utente nuovoUtente = new Utente(nome, email);
                    gestore.aggiungiUtente(nuovoUtente);
                    System.out.println("Iscrizione avvenuta con successo!");
                    break;

                case 2:
                    System.out.print("Inserisci il tuo nome: ");
                    String nomeRimuovere = scanner.nextLine();
                    System.out.print("Inserisci la tua email: ");
                    String emailRimuovere = scanner.nextLine();
                    Utente utenteDaRimuovere = new Utente(nomeRimuovere, emailRimuovere);
                    gestore.rimuoviUtente(utenteDaRimuovere);
                    System.out.println("Disiscrizione avvenuta con successo!");
                    break;

                case 3:
                    System.out.print("Inserisci il messaggio da inviare: ");
                    String messaggio = scanner.nextLine();
                    gestore.inviaNotifica(messaggio);
                    break;

                case 4:
                    System.out.println("Arrivederci!");
                    continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}
