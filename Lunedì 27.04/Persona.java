
abstract class Persona {

    private String nome; 
    private int eta;

    public Persona(String nome, int eta) { // Costruttore
        this.nome = nome;
        this.eta = eta;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public abstract void descriviRuolo(); // metodo astratto
}
