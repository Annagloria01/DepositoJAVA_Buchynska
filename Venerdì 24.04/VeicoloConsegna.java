abstract class VeicoloConsegna {
    protected String targa;
    protected float caricoMassimo;

    public VeicoloConsegna(String targa, float caricoMassimo) {
        this.targa = targa;
        this.caricoMassimo = caricoMassimo;
    }

    // Metodo astratto con parametro peso (Estensione Facoltativa)
    public abstract void consegnaPacco(String destinazione, float pesoPacco);

    public void stampaInfo() {
        System.out.println("[INFO] Veicolo: " + targa + " | Capacità Max: " + caricoMassimo + "kg");
    }
}