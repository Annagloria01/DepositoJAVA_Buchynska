public class MainHotel {
    public static void main(String[] args) {
        // Creazione Hotel
        Hotel mioHotel = new Hotel("Grand Hotel Java");

        // Aggiunta 2 Camere Normali
        mioHotel.aggiungiCamera(new Camera(101, 80.50f));
        mioHotel.aggiungiCamera(new Camera(102, 95.00f));

        // Aggiunta 2 Suite
        mioHotel.aggiungiCamera(new Suite(501, 250.00f, "Spa privata, Champagne"));
        mioHotel.aggiungiCamera(new Suite(502, 300.00f, "Vista Mare, Idromassaggio"));

        System.out.println("--- ELENCO DETTAGLIATO (Overload 1) ---");
        for (Camera c : mioHotel.getListaCamere()) {
            c.dettagli(); // Mostra tutto (inclusi extra per Suite)
        }

        System.out.println("\n--- ELENCO RAPIDO SENZA PREZZO (Overload 2) ---");
        for (Camera c : mioHotel.getListaCamere()) {
            c.dettagli(false); // Stampa solo il numero
        }

        // Utilizzo del metodo statico
        int quanteSuite = Hotel.contaSuite(mioHotel.getListaCamere());
        
        System.out.println("\n--- STATISTICHE ---");
        System.out.println("Totale Suite trovate: " + quanteSuite);
    }
}