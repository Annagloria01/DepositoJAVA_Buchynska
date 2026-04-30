package NotificaBorsa;

public class SessioneUtente implements Investitore {
    private static SessioneUtente istanza;
    private String username;

    private SessioneUtente(String username) {
        this.username = username;
    }

    // Metodo di login
    public static SessioneUtente login(String username) {
        if (istanza == null) {
            istanza = new SessioneUtente(username);
            System.out.println("Login effettuato con successo! Benvenuto, " + username);
        } else {
            System.out.println("Errore: C'è già un utente loggato (" + istanza.username + ")");
        }
        return istanza;
    }

    public String getUsername() { return username; }

    @Override
    public void notifica(String azione, double valore) {
        System.out.println("\n[NOTIFICA PER TE] " + username + ", l'azione " + azione + " è ora a " + valore + "€");
    }
}