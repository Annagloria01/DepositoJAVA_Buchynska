
import java.util.ArrayList;
import java.util.Scanner;

public class ConsegnaManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<VeicoloConsegna> flotta = new ArrayList<>();
        boolean continua = true;

        System.out.println("=== GESTIONALE CONSEGNE AVANZATO ===");

        while (continua) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Aggiungi un Furgone");
            System.out.println("2. Aggiungi un Drone");
            System.out.println("3. Avvia spedizione");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");
            
            int scelta = scanner.nextInt();
            scanner.nextLine(); 

            switch (scelta) {
                case 1:
                    System.out.print("Targa furgone: ");
                    String targaF = scanner.nextLine();
                    System.out.print("Carico massimo (kg): ");
                    float caricoF = scanner.nextFloat();
                    flotta.add(new Furgone(targaF, caricoF));
                    System.out.println("Furgone registrato.");
                    break;

                case 2:
                    System.out.print("ID Drone: ");
                    String idD = scanner.nextLine();
                    System.out.print("Carico massimo (kg): ");
                    float caricoD = scanner.nextFloat();
                    flotta.add(new Drone(idD, caricoD));
                    System.out.println("Drone registrato.");
                    break;

                case 3:
                    if (flotta.isEmpty()) {
                        System.out.println("Nessun veicolo in flotta!");
                    } else {
                        System.out.print("Destinazione della spedizione: ");
                        String dest = scanner.nextLine();
                        System.out.print("Peso del pacco da spedire (kg): ");
                        float peso = scanner.nextFloat();

                        System.out.println("--- ELABORAZIONE SPEDIZIONI ---");
                        for (VeicoloConsegna v : flotta) {
                            v.stampaInfo();
                            v.consegnaPacco(dest, peso); // Qui avviene il controllo del carico
                            
                            if (v instanceof Tracciabile) {
                                ((Tracciabile) v).tracciaConsegna("TRK-" + (int)(Math.random() * 10000));
                            }
                        }
                    }
                    break;

                case 4:
                    continua = false;
                    System.out.println("Spegnimento sistema...");
                    break;

                default:
                    System.out.println("Scelta errata.");
            }
        }
    }
}