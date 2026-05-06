package FacadeEsercizioFacile;

//Strategia 1: modalità relax
public class ModalitaRelax implements IlluminazioneStrategy {

    public void applicaImpostazioni(String ambiente) {
        System.out.println("[" + ambiente + "] Luce Calda (Arancione), intensità 30%, timer 60 min.");
    }
}
