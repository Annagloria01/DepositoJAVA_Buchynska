
public class Utente {

    // L'unica istanza dell'utente loggato
    private static Utente istanza;

    // Attributi dell'utente
    private String nome;

    // Costruttore privato
    private Utente() {
        this.nome = nome;
    }

    // Metodo per ottenere l'unica istanza
    public static Utente getIstanza() {
        if (istanza == null) {
            istanza = new Utente();
        }
        return istanza;
    }

    // Getter e Setter per il nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Utente: " + nome + " (ID: " + System.identityHashCode(this) + ")";
    }
}
