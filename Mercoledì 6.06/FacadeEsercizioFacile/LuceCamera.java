package FacadeEsercizioFacile;

public class LuceCamera {
   public void accendi(IlluminazioneStrategy strategy) {
        System.out.print("Camera: ");
        strategy.applicaImpostazioni("CAMERA");
    } 
}
