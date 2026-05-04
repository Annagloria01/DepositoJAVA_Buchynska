public class DecoratoreMaiuscolo implements Messaggio {
    private Messaggio messaggioIncapsulato; // Riferimento all'oggetto da decorare

    public DecoratoreMaiuscolo(Messaggio messaggio) {
        this.messaggioIncapsulato = messaggio;
    }

    @Override
    public String getContenuto() {
        // Prende il contenuto dell'oggetto interno e lo trasforma
        return messaggioIncapsulato.getContenuto().toUpperCase();
    }
}