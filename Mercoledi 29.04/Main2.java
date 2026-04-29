import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Richiamo dell'istanza del DatabaseManager e dell'Utente
        DatabaseManager db = DatabaseManager.getInstance();
        Utente user1 = Utente.getIstanza();

        // Impostiamo il nome dell'utente
        user1.setNome("Mario");
        Scanner in = new Scanner(System.in);


        // Simulazione di un pannello di controllo per interagire con il DatabaseManager
        int scelta = 0;
        do {
            System.out.println("\n--- PANNELLO DI CONTROLLO ---");
            System.out.println("1. Connessione DB");
            System.out.println("2. Salva nuovo dato");
            System.out.println("3. Visualizza lista dati");
            System.out.println("4. Report connessioni");
            System.out.println("5. Esci");
            System.out.print("Operazione: ");
            
            // Leggiamo la scelta dell'utente
            scelta = in.nextInt();
            in.nextLine(); 

            switch (scelta) {
                case 1:
                    db.connect();
                    break;
                case 2:
                    System.out.print("Cosa vuoi salvare? ");
                    String input = in.nextLine();
                    db.salvaDato(input, user1);
                    break;
                case 3:
                    db.visualizzaDati();
                    break;
                case 4:
                    System.out.println("Totale chiamate connect(): " + db.getConnectionCount());
                    break;
                case 5:
                    System.out.println("Chiusura in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 5);
    }
}