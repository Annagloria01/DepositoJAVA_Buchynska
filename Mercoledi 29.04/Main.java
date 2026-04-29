public class Main {
    public static void main(String[] args) {
        
        //primo richiamo dell'istanza
        Logger logger1 = Logger.getInstanza();
        logger1.Scrivimessaggio("Primo messaggio");
        Utente user1 = Utente.getIstanza();

        // Impostiamo il nome tramite il primo riferimento
        user1.setNome("Mario");
        logger1.Scrivimessaggio("Accesso effettuato da: " + user1.getNome());

        //secondo richiamo dell'istanza
        Logger logger2 = Logger.getInstanza(); 
        logger2.Scrivimessaggio("Secondo messaggio");

        // Richiamiamo l'utente da un'altra parte del codice
        Utente user2 = Utente.getIstanza();
        logger2.Scrivimessaggio("Verifica utente in corso...");

        //verifica se logger1 e logger2 sono la stessa istanza
        if (logger1 == logger2) {
            System.out.println("logger1 e logger2 puntano alla stessa istanza.");
        } else {
            System.out.println("Errore, le istanze sono diverse.");
        }

        if (user1 == user2) {
            System.out.println("Confermato: user1 e user2 sono lo STESSO utente.");
        }

        System.out.println("Riferimento 1: " + logger1);
        System.out.println("Riferimento 2: " + logger2);
        System.out.println(user1);
        System.out.println(user2);

    }
}
