import java.util.List;

// Interfaccia per gli osservatori della fabbrica di auto
public interface FabbricaObserver {
    void update(List<Veicolo> veicoli);
}

