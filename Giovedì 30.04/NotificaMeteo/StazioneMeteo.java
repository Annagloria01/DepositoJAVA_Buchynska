package NotificaMeteo;

import java.util.ArrayList;

public class StazioneMeteo {
    private ArrayList<Display> displays = new ArrayList<>();
    private float temperatura;

    public void aggiungiDisplay(Display display) {
        displays.add(display);
    }

    public void rimuoviDisplay(Display display) {
        displays.remove(display);
    }

    public void notificaDisplay() {
        for (Display display : displays) {
            display.aggiorna(temperatura);
        }
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificaDisplay();
    }
}
