import java.util.ArrayList;

public class DatabaseManager {
    private static DatabaseManager instance;
    private ArrayList<String> database; // Utilizzo di ArrayList
    private int connectionCount = 0;

    private DatabaseManager() {
        // Inizializzazione dell'ArrayList
        database = new ArrayList<>();
    }

    public static DatabaseManager getInstance() { // Metodo per ottenere l'unica istanza
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    public void connect() { // Simulazione di una connessione al database
        connectionCount++;
        System.out.println("Connessione stabilita. Connessioni attive: " + connectionCount);
    }

    // Metodo per aggiungere un dato (legato all'utente)
    public void salvaDato(String dato, Utente u) {
        String record = "Autore: " + u.getNome() + " | Contenuto: " + dato;
        database.add(record); // L'ArrayList cresce automaticamente
        System.out.println("Dato salvato con successo!");
    }

    // Metodo per visualizzare tutto il contenuto
    public void visualizzaDati() {
        System.out.println("\n--- CONTENUTO DATABASE (ArrayList) ---");
        if (database.isEmpty()) {
            System.out.println("Il database è attualmente vuoto.");
        } else {
            for (int i = 0; i < database.size(); i++) {
                System.out.println(i + ") " + database.get(i));
            }
        }
    }

    public int getConnectionCount() {
        return connectionCount;
    }
}