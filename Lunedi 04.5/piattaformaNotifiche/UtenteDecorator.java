package piattaformaNotifiche;

//decoratore astratto
public abstract class UtenteDecorator implements UtentiObserver {
    protected UtentiObserver utenteProtetto; //utente interno

    public UtenteDecorator(UtentiObserver utente){
        this.utenteProtetto = utente;
    }

    @Override
    public void update(String messaggio){
        utenteProtetto.update(messaggio);
    }

    @Override
    public String getNome() {
        // Delega la richiesta del nome all'utente interno
        return utenteProtetto.getNome();
    }
}
