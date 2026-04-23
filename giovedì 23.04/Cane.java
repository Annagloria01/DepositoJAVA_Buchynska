public class Cane extends Animale {

    public Cane(String nome, int eta) {//costruttore che richiama il costruttore della superclasse
        super(nome, eta);
    }

    @Override//metodo che stampa il verso del cane
    public void faiVerso() {
        System.out.println("Bau!");
    }
    
}
