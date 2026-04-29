
public class Utente2 {

    private static Utente2 instance;
    private String nome;

    private Utente2() {
    }

    public static Utente2 getInstance() {
        if (instance == null) {
            instance = new Utente2();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
