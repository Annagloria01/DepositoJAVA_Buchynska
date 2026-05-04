package piattaformaNotifiche;

import java.util.ArrayList;

public class NotificationManager {
    //istanza privata

    private static NotificationManager istance;
    ArrayList<UtentiObserver> osservatori = new ArrayList<>();

    //costruttore privato
    private NotificationManager() {}

    //metodo publico statico per ottenere l'istanza
    public static NotificationManager getIstance(){
        if(istance == null){
            istance = new NotificationManager();
        }

        return istance;
    } 

    public void iscrivi (UtentiObserver o){
        osservatori.add(o);
    }

    public void disiscrivi (UtentiObserver o){
        osservatori.remove(o);
    }

    public void inviaNotifica(String messaggio){
        for (UtentiObserver o : osservatori ){
            o.update(messaggio);
        }
    }
}
