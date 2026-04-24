class Moto extends Veicolo {
    private int cilindrata;

    // Costruttore
    public Moto(String targa, int velocita, int numeroAssi, int cilindrata) {
        super(targa, velocita, numeroAssi);
        this.cilindrata = cilindrata;
    }

    @Override
    public double calcolaPedaggio() {
        return 1.00 + (getNumeroAssi() * 0.80);
    }

    @Override
    public void stampaDettagli() {
        System.out.print("[VEICOLO: MOTO] "); // Specifica il tipo
        super.stampaDettagli();
        System.out.println(" | Cilindrata: " + cilindrata + "cc | Pedaggio: " + calcolaPedaggio() + "€");
    }
}