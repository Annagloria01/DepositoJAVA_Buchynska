
import java.util.List;

public class FabbricaView implements FabbricaObserver {

    //View che implementa l'interfaccia dell'osservatore per aggiornarsi quando il modello cambia
    @Override
    public void update(List<Veicolo> veicoli) {
        // Logica per aggiornare la vista quando il modello cambia
        System.out.println("La fabbrica ha prodotto un nuovo veicolo!");
        for (int i = 0; i < veicoli.size(); i++) {
            System.out.println((i + 1) + ". " + veicoli.get(i).getDescrizione());
        }

    }
}
