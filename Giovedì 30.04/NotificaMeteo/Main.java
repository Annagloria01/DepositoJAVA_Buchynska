package NotificaMeteo;

public class Main {
    
    public static void main(String[] args) {
        StazioneMeteo stazione = new StazioneMeteo();

        // Creiamo i display
        Display console = new DisplayConsole();
        Display mobile = new DisplayMobile();

        // Registriamo i display presso la stazione
        stazione.aggiungiDisplay(console);
         stazione.setTemperatura(25.0f);

        // Simuliamo il cambio di temperatura
        stazione.aggiungiDisplay(mobile);
        stazione.setTemperatura(22.5f);
       

        // Rimuoviamo un display e testiamo di nuovo
        stazione.rimuoviDisplay(console);
        stazione.setTemperatura(28.2f);
    }
}
