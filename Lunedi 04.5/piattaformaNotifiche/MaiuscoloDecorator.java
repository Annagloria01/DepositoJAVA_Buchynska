package piattaformaNotifiche;

public class MaiuscoloDecorator extends UtenteDecorator{

    //decorator concreto
    public MaiuscoloDecorator(UtentiObserver utente) {
        super(utente);
    }
       
    public void update(String messaggio){
        //Trasformiamo il messaggio in maiuscolo
        String messaggioMaiuscolo = messaggio.toUpperCase();
        super.update(messaggioMaiuscolo);
    }
    }

