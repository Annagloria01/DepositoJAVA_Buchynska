
import java.util.ArrayList;


class Docente extends Persona implements Registrabile {

    private String materia;
    private ArrayList<Studente> studentiMateria = new ArrayList<>();

    public Docente(String nome, int eta, String materia) {
        super(nome, eta);
        this.materia = materia;
    }

    public void aggiungiStudente(Studente s) { // metodo per aggiungere studenti alla materia del docente
        studentiMateria.add(s);
    }

    // solo il docente specifico accede ai dettagli dello studente
    public void visualizzaInfoStudente(Studente s) {
        if (studentiMateria.contains(s)) {
            System.out.println("Accesso autorizzato per materia: " + materia);
            System.out.println(s.getDettagliPerDocente()); 
        } else {
            System.out.println("Accesso negato: " );
        }
    }

    public void assegnaVoto(Studente s, int voto) { // metodo per assegnare voti agli studenti della materia del docente
        if (studentiMateria.contains(s)) {
            s.riceviVoto(voto);
            System.out.println("Voto " + voto + " assegnato a " + s.getNome() + " in " + materia);
        } else {
            System.out.println("Errore: Studente non assegnato a questo docente.");
        }
    }

    @Override
    public void descriviRuolo() {
        System.out.println("Sono un docente di " + materia);
    }

    @Override
    public void registrazione() {
        System.out.println("Registrazione tramite segreteria didattica effettuata.");
    }
}

// Sottoclassi specifiche 
class DocenteOrdinario extends Docente {

    public DocenteOrdinario(String nome, int eta, String mat) {
        super(nome, eta, mat);
    }
}

class DocenteSostegno extends Docente {

    public DocenteSostegno(String nome, int eta, String mat) {
        super(nome, eta, mat);
    }
}
