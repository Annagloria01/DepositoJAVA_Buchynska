package eserciziomedio;

public class Main {
    public static void main(String[] args) {
        // Partiamo dalla base
        Hamburger mioOrdine = new baseBurger();

        // Aggiungiamo il formaggio
        mioOrdine = new FormaggioDecorator(mioOrdine);

        // Aggiungiamo il bacon
        mioOrdine = new BaconDecorator(mioOrdine);

        System.out.println("Ordine: " + mioOrdine.getDescrizione());
        System.out.println("Prezzo totale: " + mioOrdine.getPrezzo() + "€");
    }
}
   
