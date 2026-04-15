
import java.util.Scanner;

public class EsercizioArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //definisco le variabili per i dolci e le quantità
        String[] nomiDolci = new String[10];
        int[] quantita = new int[10];

        System.out.println("Quanti dolci vuoi inserire? (max 10)");
        int numDolci = scanner.nextInt();
        scanner.nextLine();

        //chiedo all'utente di inserire i nomi dei dolci e le quantità
        for (int i = 0; i < numDolci; i++) {
            System.out.println("Inserisci il nome del dolce" + " " + (i + 1) + ": ");
            nomiDolci[i] = scanner.nextLine();

            System.out.println("Quantità del dolce " + (i + 1));
            quantita[i] = scanner.nextInt();

            //controllo il valore delle quantità
            while (quantita[i] < 0) {
                System.out.println("Numero inserito non valido. Inserisci un altro numero");
                quantita[i] = scanner.nextInt();
            }

            scanner.nextLine();
        }
        
        //calcolo e stampaggio totale quantità

        int totale = 0;
        for (int i = 0; i < quantita.length; i++) {
            totale+=quantita[i];
        }
         System.out.println("Il totale dei ordini è " + totale);

         for (int i = 0; i < nomiDolci.length; i++) {
            if(nomiDolci[i] !=null){
                System.out.println("Ordine effetuato " + nomiDolci[i] + " " + quantita[i]);
            }
         }
    }

}
