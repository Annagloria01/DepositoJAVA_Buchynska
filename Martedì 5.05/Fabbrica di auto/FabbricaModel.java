
import java.util.ArrayList;
import java.util.List;

class FabbricaModel {

    //singleton per la fabbrica

    private static FabbricaModel instance;
    private List<Veicolo> veicoliProdotti = new ArrayList<>(); 
    private List<FabbricaObserver> observers = new ArrayList<>();

    private FabbricaModel() {
    }

    public static FabbricaModel getInstance() {
        if (instance == null) {
            instance = new FabbricaModel();
        }
        return instance;
    }

    public void aggiungiObserver(FabbricaObserver obs) {
        observers.add(obs);
    }

    public void produciVeicolo(Veicolo v) {
        veicoliProdotti.add(v);
        notificaObservers();
    }

    private void notificaObservers() {
        for (FabbricaObserver obs : observers) {
            obs.update(new ArrayList<>(veicoliProdotti));
        }
    }
}
