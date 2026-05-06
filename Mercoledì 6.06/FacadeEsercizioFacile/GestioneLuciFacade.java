package FacadeEsercizioFacile;

public class GestioneLuciFacade {
    private LuceCamera camera;
    private LuceCucina cucina;
    private IlluminazioneStrategy strategy;

    public GestioneLuciFacade(IlluminazioneStrategy strategyIniziale) {
        this.camera = new LuceCamera();
        this.cucina = new LuceCucina();
        this.strategy = strategyIniziale;
    }

    // Permette di cambiare strategia dinamicamente
    public void setStrategy(IlluminazioneStrategy nuovaStrategy) {
        this.strategy = nuovaStrategy;
    }

    public void accendiTutte() {
        System.out.println("--- Esecuzione comando Facade: Accensione Totale ---");
        camera.accendi(strategy);
        cucina.accendi(strategy);
        System.out.println("----------------------------------------------------\n");
    }
}
