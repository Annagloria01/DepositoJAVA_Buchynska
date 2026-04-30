package GestioneSistemaE_learning;

import java.util.ArrayList;

//singleton pattern
public class GestoreNotifiche {
    private static GestoreNotifiche instance;
    private ArrayList<Iscritto> iscritti;

    private GestoreNotifiche() { //costruttore privato
        this.iscritti = new ArrayList<>();
    }

    public static GestoreNotifiche getInstance() {
        if (instance == null) {
            instance = new GestoreNotifiche();
        }
        return instance;
    }

    public void aggiungiUtente(Iscritto iscritto) {
        this.iscritti.add(iscritto);
    }

    public void rimuoviUtente(Iscritto iscritto) {
        this.iscritti.remove(iscritto);
    }

    public void inviaNotifica(String messaggio) { //metodo per inviare notifiche a tutti gli iscritti
        for (Iscritto utente : iscritti) {
            utente.update(messaggio);
        }
    }
}

