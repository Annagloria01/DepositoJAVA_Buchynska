
import java.util.Scanner;

public class EsercizioFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti voti vuoi inserire?");
        int numVoti = scanner.nextInt();

        // While per validare che il numero sia maggiore di zero
        while (numVoti <= 0) {
            System.out.println("Il numero deve essere un intero positivo. Riprova.");
            numVoti = scanner.nextInt();
        }

        int votiValidi = 0;

        // For per inserire ogni voto
        for (int i = 1; i <= numVoti; i++) {
            System.out.print("Inserisci il voto ");
            int voto = scanner.nextInt();

            if (voto >= 0 && voto <= 30) {
                // Voto valido
                votiValidi++;
                if (voto >= 24) {
                    System.out.println("Buono");
                } else if (voto >= 18) {
                    System.out.println("Sufficiente");
                } else {
                    System.out.println("Insufficiente");
                }
            } else {
                // Voto fuori range
                System.out.println("Voto non valido");
            }
        }

        System.out.println("Numero totale di voti validi inseriti: " + votiValidi);

    }
}

