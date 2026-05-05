
public class FabbricaController {

    //controller che gestisce la logica di produzione dei veicoli e aggiorna la vista
    private FabbricaModel model;

    public FabbricaController(FabbricaModel model, FabbricaView view) {
        this.model = model;
        this.model.aggiungiObserver(view);
    }

    public void creaVeicolo(String tipo, boolean haNavigatore, boolean haSicurezza) {
        Veicolo v; //dichiarazione variabile senza un valore iniziale

        //usaimo un if else esplicito per decidere quale oggetto creare
        if (tipo.equalsIgnoreCase("Auto")) {
            v = new Auto();
        } else  {
            v = new Moto();
        }

        //applichiamo i decoratori in base alle scelte dell'utente
        if (haNavigatore) {
            v = new Navigatore(v);
        }
        if (haSicurezza) {
            v = new PacchettoSicurezza(v);
        }
        model.produciVeicolo(v);
    }
}
