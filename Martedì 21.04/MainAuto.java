public class MainAuto {
    public static void main(String[] args) {
        Officina officina = new Officina();

        // Creo alcune auto
        Auto auto1 = new Auto("AB123CD", "Fiat Panda");
        Auto auto2 = new Auto("EF456GH", "Renault Clio");
        Auto auto3 = new Auto("IJ789KL", "Volkswagen Golf");

        // Aggiungo le auto all'officina
        officina.aggiungiAuto(auto1);
        officina.aggiungiAuto(auto2);
        officina.aggiungiAuto(auto3);

          // toString() su una singola auto
        System.out.println(auto1);

        // toString() sull'officina
        System.out.println(officina);

        // hashCode()
        System.out.println("HashCode auto1: " + auto1.hashCode());
        System.out.println("HashCode officina: " + officina.hashCode());


        // Stampo l'elenco delle auto in officina
        officina.stampaElenco();
    }

}
