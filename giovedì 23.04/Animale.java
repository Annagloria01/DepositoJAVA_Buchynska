public class Animale {
    protected String nome;
    protected int eta;

    public Animale(String nome, int eta) {//costruttore
        this.nome = nome;
        this.eta = eta;
    }

    public void faiVerso() {//metodo che stampa un verso generico
        System.out.println("Verso generico");
    }
}