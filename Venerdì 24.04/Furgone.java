class Furgone extends VeicoloConsegna implements Tracciabile {
    // Costruttore
    public Furgone(String targa, float caricoMassimo) {
        super(targa, caricoMassimo);
    }

    @Override
    public void consegnaPacco(String destinazione, float pesoPacco) {
        if (pesoPacco > caricoMassimo) {
            System.out.println(">>> [ERRORE] Il furgone " + targa + " è sovraccarico! (" + pesoPacco + "kg su " + caricoMassimo + "kg max)");
        } else {
            System.out.println(">>> [STRADA] Il furgone " + targa + " sta consegnando a: " + destinazione);
        }
    }

    @Override
    public void tracciaConsegna(String codiceTracking) {
        System.out.println("    Tracking: Mezzo segnalato sulla rete stradale urbana [" + codiceTracking + "]");
    }
}