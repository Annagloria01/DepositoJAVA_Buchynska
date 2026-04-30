package NotificaBorsa;

import java.util.ArrayList;

public class AgenziaBorsa {
    private  ArrayList<Investitore> investitori = new ArrayList<>();

    public void aggiungiInvestitore(Investitore investitore) {
        investitori.add(investitore);
    }

    public void rimuoviInvestitore(Investitore investitore) {
        investitori.remove(investitore);
    }

    public void notificaInvestitori(String azione, double valore) {
        for (Investitore investitore : investitori) {
            investitore.notifica(azione, valore);
        }
    }

        public void aggiornaValoreAzione(String azione, double nuovoValore) {
            System.out.println("Azione: " + azione + ", Nuovo Valore: " + nuovoValore);
            notificaInvestitori(azione, nuovoValore);
        }
}
