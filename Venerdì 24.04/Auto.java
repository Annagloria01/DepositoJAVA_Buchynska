class Auto extends Veicolo {
    private String modello;

    // Costruttore
    public Auto(String targa, int velocita, int numeroAssi, String modello) {
        super(targa, velocita, numeroAssi);
        this.modello = modello;
    }

    @Override
    public double calcolaPedaggio() {
        return 2.00 + (getNumeroAssi() * 1.50);
    }

    @Override
    public void stampaDettagli() {
        System.out.print("[VEICOLO: AUTO] "); 
        super.stampaDettagli();
        System.out.println(" | Modello: " + modello + " | Pedaggio: " + calcolaPedaggio() + "€");
    }
}