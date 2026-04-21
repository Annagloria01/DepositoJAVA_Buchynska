import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 29.99);
        Libro libro2 = new Libro("Harry Potter e la Pietra Filosofale", "J.K. Rowling", 19.99);
        Libro libro3 = new Libro("Il Codice Da Vinci", "Dan Brown", 24.99);
        Libro libro4 = new Libro("Oceano Mare", "Alessandro Baricco", 14.00);
        
        libro1.stampaDettagli();
        libro2.stampaDettagli();
        libro3.stampaDettagli();
        libro4.stampaDettagli(); */


     /*    Persona persona1 = new Persona("Mario", "Roma", 30);
        Persona persona2 = new Persona("Luigi", "Milano"); 
        Persona persona3 = new Persona();

        persona1.stampaDettagli();
        persona2.stampaDettagli(); 
        persona3.stampaDettagli(); */

        ArrayList<BankAccount> accounts = new ArrayList<>();

        // Aggiungiamo alcuni account di prova
        accounts.add(new BankAccount("Mario Rossi", 1000.0));
        accounts.add(new BankAccount("Luigi Bianchi", 500.0));
        accounts.add(new BankAccount("Anna Verdi", 2500.0));

        // Scelta account per nome
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        BankAccount account = null; // Variabile per memorizzare l'account trovato
        for (BankAccount a : accounts) { // Ciclo per trovare l'account corrispondente al nome inserito
            if (a.accountHolderName.equalsIgnoreCase(nome)) {
                account = a;
                break;
            }
        }

        if (account == null) { // Se non troviamo l'account, stampiamo un messaggio di errore
            System.out.println("Account non trovato!");
            return;
        }

        account.displayBalance(); // Mostriamo il saldo attuale
    }
}
