class Drone extends VeicoloConsegna implements Tracciabile {
    // Costruttore
    public Drone(String id, float caricoMassimo) {
        super(id, caricoMassimo);
    }

    @Override
    public void consegnaPacco(String destinazione, float pesoPacco) {
        if (pesoPacco > caricoMassimo) {
            System.out.println(">>> [ERRORE] Il drone " + targa + " non può decollare: peso eccessivo! (" + pesoPacco + "kg)");
        } else {
            System.out.println(">>> [VOLO] Il drone " + targa + " è in volo verso: " + destinazione);
        }
    }

    @Override
    public void tracciaConsegna(String codiceTracking) {
        System.out.println("    Tracking: Segnale GPS acquisito dai sensori di bordo [" + codiceTracking + "]");
    }
}