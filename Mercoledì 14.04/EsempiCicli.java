
import java.util.Scanner;

public class EsempiCicli {

    public static void main(String[] args) {
        
        // Esempio ciclo while
        int i = 1;

        // Inizializzazione della variabile di controllo
        while (i <= 5) {
            i++; // Incremento della variabile di controllo
            System.out.println(i);

        }
        //Esempio do while
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Inserisci un numero (0 per uscire): ");
            numero = input.nextInt();
        } while (numero != 0);

        System.out.println("Hai inserito 0. Programma terminato.");

    }
}
