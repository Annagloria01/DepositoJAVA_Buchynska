package NotificaBorsa;

public class InvestitorePrivato implements Investitore {
    private String nome;

    public InvestitorePrivato(String nome) {
        this.nome = nome;
    }

    @Override
    public void notifica(String azione, double valore) {
        System.out.println("[Privato - " + nome + "] Controlla il tuo portafoglio: " 
            + azione + " ha un nuovo prezzo di " + valore + "€");
    }
}
