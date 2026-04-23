
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    ArrayList<Cane> listaCani = new ArrayList<>();
    ArrayList<Gatto> listaGatti = new ArrayList<>();
    ArrayList<Animale> listaMista = new ArrayList<>();

    public void riempiZoo() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Inserimento Animale ---");
            System.out.println("Inserisci il NOME (o premi INVIO per uscire):");
            String nome = scanner.nextLine();

            // Uscita: se il nome è vuoto, il ciclo si interrompe
            if (nome.isEmpty()) {
                System.out.println("Sei uscito dall'inserimento.");
                break;
            }

            System.out.println("Inserisci l'ETÀ:");
            int eta = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Che tipo di animale è? (1: Cane, 2: Gatto, 3: Altro):");
            String tipo = scanner.nextLine();

            if (tipo.equals("1")) {
                Cane c = new Cane(nome, eta);
                listaCani.add(c);
                listaMista.add(c);
            } else if (tipo.equals("2")) {
                Gatto g = new Gatto(nome, eta);
                listaGatti.add(g);
                listaMista.add(g);
            } else {
                Animale a = new Animale(nome, eta);
                listaMista.add(a);
            }
        }
    }

    public void stampaTutto() {
        if (listaMista.isEmpty()) {
            System.out.println("Non hai inserito nessun animale.");
        } else {
            for (Animale a : listaMista) {
                String tipoAnimale = "";

                // Controlliamo di che classe è l'oggetto
                if (a instanceof Cane) {
                    tipoAnimale = "Cane";
                } else if (a instanceof Gatto) {
                    tipoAnimale = "Gatto";
                } else {
                    tipoAnimale = "Animale Generico";
                }

                // Stampiamo tutto insieme
                System.out.print("Tipo: " + tipoAnimale + " | Nome: " + a.nome
                        + " | Età: " + a.eta + " | Verso: ");
                a.faiVerso();
            }
        }
    }

}
