public class PacchettoSicurezza extends AccessorioDecorator {
    //decorazione opzionale
    public PacchettoSicurezza(Veicolo veicolo) {
        super(veicolo);
    }

    public String getDescrizione() {
        return veicolo.getDescrizione() + " con Pacchetto di Sicurezza";
    }
}
