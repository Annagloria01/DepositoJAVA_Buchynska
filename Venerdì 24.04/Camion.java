class Camion extends Veicolo {
    private double pesoCarico;

    // Costruttore
    public Camion(String targa, int velocita, int numeroAssi, double pesoCarico) {
        super(targa, velocita, numeroAssi);
        this.pesoCarico = pesoCarico;
    }

    @Override
    public double calcolaPedaggio() {
        return 5.00 + (getNumeroAssi() * 2.00) + (pesoCarico * 0.10);
    }

    @Override
    public void stampaDettagli() {
        System.out.print("[VEICOLO: CAMION] "); // Specifica il tipo
        super.stampaDettagli();
        System.out.println(" | Peso Carico: " + pesoCarico + "tonnellate | Pedaggio: " + calcolaPedaggio() + "€");
    }
}