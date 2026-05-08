import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketSystemFacade facade = new TicketSystemFacade();
        Scanner in = new Scanner(System.in);
        
        // Simuliamo un utente che accede al sistema
        System.out.print("Benvenuto! Inserisci il tuo nome: ");
        String nomeUtente = in.nextLine();
        Utente utenteCorrente = new Utente(nomeUtente);

        String sessione = "";
        while (!sessione.equals("fine")) {
            System.out.println("\n--- SISTEMA TICKET (Loggato come: " + nomeUtente + ") ---");
            System.out.println("Scegli ruolo: [utente] [admin] (o 'fine')");
            sessione = in.nextLine().toLowerCase();

            if (sessione.equals("utente")) {
                System.out.println("1. Apri Ticket | 2. Visualizza Stato | 3. Indietro");
                String scelta = in.nextLine();
                if (scelta.equals("1")) {
                    System.out.print("Descrizione guasto: ");
                    facade.creaTicket(in.nextLine(), utenteCorrente);
                } else if (scelta.equals("2")) {
                    facade.visualizzaTutti();
                }

            } else if (sessione.equals("admin")) {
                facade.visualizzaTutti();
                System.out.println("1. Risolvi (Update) | 2. Elimina (Delete) | 3. Indietro");
                String op = in.nextLine();
                if (op.equals("1")) {
                    System.out.print("ID da risolvere: ");
                    facade.risolviTicket(Integer.parseInt(in.nextLine()));
                } else if (op.equals("2")) {
                    System.out.print("ID da eliminare: ");
                    facade.eliminaTicket(Integer.parseInt(in.nextLine()));
                }
            }
        }
    }
}