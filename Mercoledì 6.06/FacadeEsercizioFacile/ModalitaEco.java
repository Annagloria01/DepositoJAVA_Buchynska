package FacadeEsercizioFacile;

public class ModalitaEco implements IlluminazioneStrategy {

    //Strategia 2: modalità risparmio
    public void applicaImpostazioni(String ambiente) {
        System.out.println("[" + ambiente + "] Luce Bianca Fredda, intensità 10%, spegnimento automatico 5 min.");
    }

}
