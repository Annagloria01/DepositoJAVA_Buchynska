
import java.util.ArrayList;

class Studente extends Persona implements Registrabile {

    private String classeFrequentata;
    private ArrayList<Integer> voti = new ArrayList<>();

    public Studente(String nome, int eta, String classeFrequentata) {
        super(nome, eta);
        this.classeFrequentata = classeFrequentata;
    }

    // Metodo visibile solo al docente (package-private)
    String getDettagliPerDocente() {
        return "Info Studente [Nome: " + getNome() + ", Età: " + getEta()
                + ", Classe: " + classeFrequentata + ", Voti: " + voti + "]";
    }

    @Override
    public void descriviRuolo() {
        System.out.println("Sono uno studente della classe " + classeFrequentata);
    }

    @Override
    public void registrazione() {
        System.out.println("Registrazione tramite modulo online effettuata.");
    }

    void riceviVoto(int voto) {
        voti.add(voto);
    }
}

// Sottoclassi specifiche Studente
class StudenteLiceale extends Studente {

    public StudenteLiceale(String nome, int eta, String classe) {
        super(nome, eta, classe);
    }
}

class StudenteTecnico extends Studente {

    public StudenteTecnico(String nome, int eta, String classe) {
        super(nome, eta, classe);
    }
}
