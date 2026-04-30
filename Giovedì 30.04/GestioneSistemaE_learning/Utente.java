package GestioneSistemaE_learning;

//utente che riceve notifiche
public class Utente implements Iscritto {
    private String nome;
    private String email;

    public Utente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override //implementazione del metodo update dell'interfaccia Iscritto
    public void update(String messaggio) {
        System.out.println("Notifica per " + nome + ": " + messaggio);
    }

}
