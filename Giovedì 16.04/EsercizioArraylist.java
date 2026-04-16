
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EsercizioArraylist {
    public static void main(String[] args) {
        ArrayList<String> studenti = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Aggiunta studenti finché non scrive "fine"
        System.out.println("Inserisci nomi (scrivi 'fine' per fermarti):");
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("fine")) {
            studenti.add(input);
            input = scanner.nextLine();
        }

        // Stampa in ordine alfabetico
        Collections.sort(studenti);
        System.out.println("Studenti in ordine alfabetico:");
        for (String s : studenti)
            System.out.println("  - " + s);

        // Conteggio
        System.out.println("Totale: " + studenti.size());

        // Eliminazione finché non scrive "fine"
        System.out.println("Chi vuoi eliminare? (scrivi 'fine' per fermarti):");
        input = scanner.nextLine();
        while (!input.equalsIgnoreCase("fine")) {
            if (studenti.remove(input))
                System.out.println("Eliminato.");
            else
                System.out.println("Non trovato.");
            input = scanner.nextLine();
        }

        // Lista finale
        Collections.sort(studenti);
        System.out.println("Lista finale:");
        for (String s : studenti)
            System.out.println("  - " + s);
        System.out.println("Totale: " + studenti.size());

        scanner.close();

        
    }
    
}