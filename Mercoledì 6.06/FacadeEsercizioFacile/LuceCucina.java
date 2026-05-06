package FacadeEsercizioFacile;

public class LuceCucina {

    public void accendi(IlluminazioneStrategy strategy) {
        System.out.print("Cucina: ");
        strategy.applicaImpostazioni("CUCINA");
    }
}
