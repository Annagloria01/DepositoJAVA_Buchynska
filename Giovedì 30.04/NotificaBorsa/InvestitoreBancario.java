package NotificaBorsa;

public class InvestitoreBancario implements Investitore {
    private String nomeBanca;

    public InvestitoreBancario(String nomeBanca) {
        this.nomeBanca = nomeBanca;
    }

    @Override
    public void notifica(String azione, double valore) {
        System.out.println("[BANCA - " + nomeBanca + "] Analisi algoritmica avviata per " 
            + azione + ". Nuovo valore di mercato: " + valore + " EUR.");
    }
    
}
