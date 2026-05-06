package FacadeEsercizioFacile;

public class Main {
    public static void main(String[] args) {
        // 1. Inizializziamo il sistema con modalità Relax
        GestioneLuciFacade casaIntelligente = new GestioneLuciFacade(new ModalitaRelax());
        
        // 2. Accendiamo tutto con la prima strategia
        System.out.println("Sera: Voglio rilassarmi.");
        casaIntelligente.accendiTutte();

        // 3. Cambiamo strategia in Eco e riaccendiamo
        System.out.println("Notte: Modalità risparmio energetico.");
        casaIntelligente.setStrategy(new ModalitaEco());
        casaIntelligente.accendiTutte();
    }
}
