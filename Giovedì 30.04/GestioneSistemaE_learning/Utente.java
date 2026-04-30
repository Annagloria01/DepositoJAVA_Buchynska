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

    @Override //override del metodo equals per confrontare utenti basati su nome ed email
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Utente utente = (Utente) obj;

        if (!nome.equals(utente.nome)) return false;
        return email.equals(utente.email);
    }

}
