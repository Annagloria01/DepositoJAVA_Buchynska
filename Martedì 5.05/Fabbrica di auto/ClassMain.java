
import java.util.Scanner;

public class ClassMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FabbricaModel model = FabbricaModel.getInstance();
        FabbricaView view = new FabbricaView();
        FabbricaController controller = new FabbricaController(model, view);

        System.out.print("Inserisci Nome Utente: ");
        String NomeUtente = sc.nextLine();

        int scelta;
        do {
            System.out.println("\nUtente: " + NomeUtente);
            System.out.println("1. Produrre Auto");
            System.out.println("2. Produrre Moto");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            scelta = sc.nextInt();

            if (scelta == 1 || scelta == 2) {
                
                String tipo;
                if (scelta == 1) {
                    tipo = "auto";
                } else {
                    tipo = "moto";
                }

                System.out.print("Aggiungere Navigatore? (true/false): ");
                boolean nav = sc.nextBoolean();

                System.out.print("Aggiungere Pacchetto Sicurezza? (true/false): ");
                boolean sic = sc.nextBoolean();

                // Chiamata al controller con i dati raccolti
                controller.creaVeicolo(tipo, nav, sic);
            } else if (scelta != 0) {
                System.out.println("Scelta non valida, riprova.");
            }

        } while (scelta != 0);
    }
}
