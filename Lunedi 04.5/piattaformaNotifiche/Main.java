package piattaformaNotifiche;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotificationManager manager = NotificationManager.getIstance();
        Scanner scanner = new Scanner(System.in);
        // Lista utenti
        ArrayList<UtentiObserver> listaUtenti = new ArrayList<>();

        int scelta = -1;

        while (scelta != 0) {
            System.out.println("\n--- GESTORE NOTIFICHE ---");
            System.out.println("1. Crea e iscrivi Utente");
            System.out.println("2. Rimuovi Utente specifico");
            System.out.println("3. Invia notifica");
            System.out.println("0. Esci");
            System.out.print("Scegli: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Nome utente: ");
                    String nome = scanner.nextLine();
                    UtentiObserver u = new utente(nome);

                    System.out.print("Vuoi decorazioni? (no/maiusc/full): ");
                    String dec = scanner.nextLine();
                    if (dec.equals("maiusc"))
                        u = new MaiuscoloDecorator(u);
                    if (dec.equals("full"))
                        u = new Timestamp(new MaiuscoloDecorator(u));

                    manager.iscrivi(u);
                    listaUtenti.add(u); // Lo salviamo per poterlo rimuovere 
                    System.out.println("Utente iscritto.");
                    break;

                case 2:
                    System.out.println("Quale utente vuoi rimuovere?");
                    for (int i = 0; i < listaUtenti.size(); i++) {
                        System.out.println(i + ". " + listaUtenti.get(i).getNome());
                    }
                    System.out.print("Indice da rimuovere: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    if (index >= 0 && index < listaUtenti.size()) {
                        UtentiObserver rimosso = listaUtenti.remove(index);
                        manager.disiscrivi(rimosso);
                        System.out.println("Utente " + rimosso.getNome() + " rimosso.");
                    }
                    break;
                case 3:
                    System.out.print("Messaggio: ");
                    String msg = scanner.nextLine();
                    manager.inviaNotifica(msg);
                    break;
            }
        }
    }
}