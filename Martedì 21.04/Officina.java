
import java.util.ArrayList;

public class Officina {
    ArrayList<Auto>listaAuto = new ArrayList<>(); //lista per tenere traccia delle auto presenti in officina

    public void aggiungiAuto(Auto auto){ //aggiunge un'auto alla lista dell'officina
        listaAuto.add(auto);
        System.out.println("Auto aggiunta: " + auto.modello);
    }

    public void stampaElenco(){ //stampa l'elenco delle auto presenti in officina
        System.out.println("Elenco auto in officina:");
        for (Auto auto : listaAuto) {
            System.out.println("- " + auto.modello + " (Targa: " + auto.targa + ")");
        }
    }

     @Override //toString() per rappresentare l'officina come stringa
    public String toString() {
        return "Officina con " + listaAuto.size() + " auto";
    }

}
