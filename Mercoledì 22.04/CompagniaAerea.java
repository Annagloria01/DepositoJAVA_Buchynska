
import java.util.ArrayList;

public class CompagniaAerea {

    private String nome;
    private ArrayList<Aereo> flotta;
    private ArrayList<Pilota> piloti;

    public CompagniaAerea(String nome) {//costruttore
        this.nome = nome;
        this.flotta = new ArrayList<>();
        this.piloti = new ArrayList<>();
    }

    public void aggiungiAereo(Aereo a) {
        flotta.add(a);
    }

    public void aggiungiPilota(Pilota p) {
        piloti.add(p);
    }

    public void stampaInfo() {

        System.out.println("\n--- FLOTTA ---");
        for (Aereo a : flotta) {
            System.out.println(a);
        }

        System.out.println("\n--- PILOTI ---");
        for (Pilota p : piloti) {
            System.out.println(p);
        }
    }
}
