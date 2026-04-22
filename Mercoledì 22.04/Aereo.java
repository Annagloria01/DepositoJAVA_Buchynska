
class Aereo {

    private String modello;
    private int numeroPosti;
    private String codice;

    public Aereo(String modello, int numeroPosti, String codice) {//costruttore
        this.modello = modello;
        setNumeroPosti(numeroPosti); // Uso il setter per validare
        this.codice = codice;
    }

    // Getter e Setter
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        if (numeroPosti > 0) {
            this.numeroPosti = numeroPosti;
        } else {
            System.out.println("Errore: Il numero di posti deve essere positivo.");
        }
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    @Override
    public String toString() {
        return "Aereo [Modello: " + modello + ", Posti: " + numeroPosti + ", Codice: " + codice + "]";
    }
}
