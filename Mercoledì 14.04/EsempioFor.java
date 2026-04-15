
import java.util.Scanner;

//Scrivi un programma Java che:
/* Chiede all'utente di inserire un numero.
Usa un ciclo for per calcolare la tabellina del numero fino a 10.
Stampa i risultati in formato leggibile.
 */
public class EsempioFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Richiede un numero all'utente
        System.out.print("Inserisci un numero: ");

        int numero = scanner.nextInt();

        // Stampa la tabellina del numero
        System.out.println("Tabellina del " + numero + ":");

        // Ciclo for per moltiplicare il numero da 1 a 10
        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));

        }

    }

}
