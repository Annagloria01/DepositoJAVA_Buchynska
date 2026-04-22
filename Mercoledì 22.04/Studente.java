
class Studente {

    private String nome;
    private int voto;

    // Attributi statici per la gestione dell'ID autoincrementante
    private static int contatoreId = 1;
    private int id;

    // Costruttore
    public Studente(String nome, int voto) {
        this.nome = nome;
        setVoto(voto); // Usiamo il setter per validare il voto fin da subito
        this.id = contatoreId++;
    }

    // Getter per il nome
    public String getNome() {
        return nome;
    }

    // Getter per il voto
    public int getVoto() {
        return voto;
    }

    // Setter per il voto con validazione
    public void setVoto(int nuovoVoto) {
        if (nuovoVoto >= 0 && nuovoVoto <= 10) {
            this.voto = nuovoVoto;
        } else {
            System.out.println("Errore: Il voto " + nuovoVoto + " non è valido (deve essere tra 0 e 10).");
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Voto: " + voto;
    }
}
