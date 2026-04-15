
import java.util.Scanner;

public class EsercizioCicli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativi = 0;
        boolean accessoRiuscito = false;
        String passwordCorretta = "java123";

        // Ciclo while per i tentativi
        while (tentativi < 3 && !accessoRiuscito) {
            System.out.println("Inserisci la password: ");
            String password = scanner.nextLine();
            if (password.equals(passwordCorretta)) {
                accessoRiuscito = true;
                System.out.println("Password corretta!");
            } else {
                tentativi++;
                int rimasti = 3 - tentativi;
                if (rimasti > 0) {
                    System.out.println("Password errata. Tentativi rimasti: " + rimasti);
                }
            }
        }

        // Controllo esito login
        if (accessoRiuscito) {
            String risposta;

            // Ciclo do-while per conferma accesso
            do {
                System.out.print("Vuoi accedere al sistema? (s/n): ");
                risposta = scanner.nextLine();

                if (!risposta.equals("s") && !risposta.equals("n")) {
                    System.out.println("Input non valido, digita s oppure n.");
                }
            } while (!risposta.equals("s") && !risposta.equals("n"));

            if (risposta.equals("s")) {
                System.out.println("Accesso al sistema effettuato.");
            } else {
                System.out.println("Accesso annullato.");
            }

        } else {
            System.out.println("Accesso bloccato.");
        }

    }
}

