public class Navigatore extends AccessorioDecorator {

    //decorazione opzionale
    public Navigatore(Veicolo veicolo) {
        super(veicolo);
    }

    public String getDescrizione() {
        return veicolo.getDescrizione() + " con Navigatore";
    }
    
}
