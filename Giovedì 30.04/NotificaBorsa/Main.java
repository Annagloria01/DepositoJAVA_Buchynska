package NotificaBorsa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Creazione dell'agenzia di borsa e variabili per la sessione utente
        AgenziaBorsa piazzaAffari = new AgenziaBorsa();
        SessioneUtente utenteLoggato = null; // Variabile per controllare il ciclo del menu

        boolean continua = true;

        while (continua) {
            System.out.println("\n--- MENU PIAZZA AFFARI ---");
            System.out.println("1. Login");
            System.out.println("2. Iscriviti alle notifiche Borsa");
            System.out.println("3. Logout ed Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); 

            switch (scelta) { // Gestione delle scelte del menu
                case 1:
                    if (utenteLoggato == null) {
                        System.out.print("Inserisci il tuo username: ");
                        String nome = scanner.nextLine();
                        utenteLoggato = SessioneUtente.login(nome);
                    } else {
                        System.out.println("Sei già loggato come: " + utenteLoggato.getUsername());
                    }
                    break;

                case 2:
                    if (utenteLoggato != null) {
                        piazzaAffari.aggiungiInvestitore(utenteLoggato);
                        System.out.println("Ti sei iscritto correttamente alle notifiche.");
                    } else {
                        System.out.println("Devi prima fare il login!");
                    }
                    break;

                case 3:
                    System.out.println("Chiusura sessione... Arrivederci!");
                    continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}