package piattaformaNotifiche;

//decorator concreto

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Timestamp extends UtenteDecorator {
    
    public Timestamp(UtentiObserver utente) {
        super(utente);
    }
    
    public void update (String messaggio){
        //otteniamo la data e l'ora attuale
        LocalDateTime oraAttuale = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormattata = oraAttuale.format(formato);
        //Nuovo messaggio decorato
        String messaggioConData = "[" + dataFormattata + "] " + messaggio;
        super.update(messaggioConData);
    }
}
