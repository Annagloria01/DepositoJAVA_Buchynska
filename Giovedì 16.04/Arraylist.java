
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();//esempi di arraylist
        numeri.add(10);
        numeri.add(20);
        numeri.add(30);

        ArrayList<String> nomi = new ArrayList<>();//esempi di arraylist
        nomi.add("Alice");
        nomi.add("Bob");
        nomi.add("Carlo");


        System.out.println("Primo nome: " + nomi.get(0));//richiamare l'array

        // Aggiunta di 10 numeri casuali e uso del ciclo for
        for (int i = 0; i < 10; i++) {
            numeri.add((int) (Math.random() * 100) + 1);//randomizzazione dei numeri da 1 a 100

        }
        // Stampa della lista originale
        System.out.println("Lista originale: " + numeri);

        // Ordinamento della lista
        Collections.sort(numeri);

        // Stampa della lista ordinata
        System.out.println("Lista ordinata: " + numeri);
    }

    

}