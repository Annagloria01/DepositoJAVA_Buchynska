import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> listaStudenti = new ArrayList<>();

        // 1. Creazione e aggiunta alla lista
        Studente s1 = new Studente("Mario Rossi", 7);
        Studente s2 = new Studente("Luca Verdi", 6);
        listaStudenti.add(s1);
        listaStudenti.add(s2);

        // 2. Stampa dati iniziali
        System.out.println(s1);
        System.out.println(s2);

        // 3. Test cambio voto (Valido e Non Valido)
        s1.setVoto(9);// Voto valido
        System.out.println("Voto attuale: " + s1.getVoto());

        System.out.println("-----------------------------");

        s1.setVoto(15);//voto non valido
        System.out.println("Voto attuale: " + s1.getVoto());//voto rimane invariato
        
        // 4. Ricerca studente tramite nome
        String nomeDaCercare = "Luca Verdi";
        boolean trovato = false;

        for (Studente s : listaStudenti) {
            if (s.getNome().equalsIgnoreCase(nomeDaCercare)) {
                System.out.println("Studente trovato: " + s);
                trovato = true;
                break;
            }
        }

        if (!trovato) {
            System.out.println("Studente '" + nomeDaCercare + "' non trovato in lista.");
        }
    }
}
    

