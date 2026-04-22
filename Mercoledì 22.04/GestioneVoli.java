
public class GestioneVoli {

    public static void main(String[] args) {
        // Creazione della compagnia
        CompagniaAerea miaCompagnia = new CompagniaAerea("SkyHigh Express");

        // Creazione aerei
        Aereo a1 = new Aereo("Boeing 747", 400, "B747-01");
        Aereo a2 = new Aereo("Airbus A320", 180, "A320-99");

        // Creazione piloti
        Pilota p1 = new Pilota("Marco Voli", "BRV123", 1500);
        Pilota p2 = new Pilota("Giovanni Bianchi", "BRV456", 2800);

        // Aggiunta alla compagnia
        miaCompagnia.aggiungiAereo(a1);
        miaCompagnia.aggiungiAereo(a2);
        miaCompagnia.aggiungiPilota(p1);
        miaCompagnia.aggiungiPilota(p2);

        // Stampa finale
        miaCompagnia.stampaInfo();

         // Test validazione setter
        System.out.println("-- Test validazione --");
        a1.setNumeroPosti(-50);   // Deve dare errore
        p1.setOreVolo(0);        // Deve dare error
    }
}
