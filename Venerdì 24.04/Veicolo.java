
abstract class Veicolo {

    private String targa;
    private int velocita;
    private int numeroAssi;

    public Veicolo(String targa, int velocita, int numeroAssi) {
        this.targa = targa;
        setVelocita(velocita);
        setNumeroAssi(numeroAssi);
    }

    public String getTarga() {
        return targa;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        if (velocita >= 0) {
            this.velocita = velocita;
        } else {
            this.velocita = 0;
        }
    }

    public int getNumeroAssi() {
        return numeroAssi;
    }

    public void setNumeroAssi(int numeroAssi) {
        if (numeroAssi > 0) {
            this.numeroAssi = numeroAssi;
        } else {
            this.numeroAssi = 1;
        }
    }

    public abstract double calcolaPedaggio();

    public void stampaDettagli() {
        System.out.print("Targa: " + targa + " | Vel: " + velocita + " km/h | Assi: " + numeroAssi);
    }
}
