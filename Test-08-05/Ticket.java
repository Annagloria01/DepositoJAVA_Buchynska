
//model
class Ticket {

    private int id;
    private String descrizione;
    private String stato;
    private Observer proprietario; // L'utente che ha creato il ticket

    public Ticket(int id, String descrizione, Observer proprietario) {
        this.id = id;
        this.descrizione = descrizione;
        this.proprietario = proprietario;
        this.stato = "APERTO";
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public Observer getProprietario() {
        return proprietario;
    }
}
