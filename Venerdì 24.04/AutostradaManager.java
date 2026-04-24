
import java.util.ArrayList;
import java.util.Scanner;

public class AutostradaManager {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        ArrayList<Veicolo> autostrada = new ArrayList<>();
        boolean continua = true;

        // Aggiunta veicoli 
        while (continua) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Aggiungi Auto\n2. Aggiungi Camion\n3. Aggiungi Moto\n4. Stato Veicoli\n5. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            // Gestione scelta
            if (scelta >= 1 && scelta <= 3) {
                System.out.print("Targa: ");
                String targa = scanner.nextLine();
                System.out.print("Velocità: ");
                int velocita = scanner.nextInt();
                System.out.print("Assi: ");
                int numeroAssi = scanner.nextInt();
                scanner.nextLine();

                if (scelta == 1) {
                    System.out.print("Modello: ");
                    String modello = scanner.nextLine();
                    autostrada.add(new Auto(targa, velocita, numeroAssi, modello));
                } else if (scelta == 2) {
                    System.out.print("Peso (t): ");
                    double pesoCarico = scanner.nextDouble();
                    autostrada.add(new Camion(targa, velocita, numeroAssi, pesoCarico));
                } else {
                    System.out.print("Cilindrata (cc): ");
                    int cilindrata = scanner.nextInt();
                    autostrada.add(new Moto(targa, velocita, numeroAssi, cilindrata));
                }

                //lista veicoli
            } else if (scelta == 4) {
                System.out.println("\n--- LISTA VEICOLI IN AUTOSTRADA ---");
                for (Veicolo v : autostrada) {
                    v.stampaDettagli();
                }
            } else if (scelta == 5) {
                continua = false;
            }
        }
    }
}