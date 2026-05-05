public abstract class AccessorioDecorator implements Veicolo {

    //pattern decorator per aggiungere accessori ai veicoli
    protected Veicolo veicolo;

    public AccessorioDecorator(Veicolo veicolo) {
        this.veicolo = veicolo;
    }
}
