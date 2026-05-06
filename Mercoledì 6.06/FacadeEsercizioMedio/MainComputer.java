package FacadeEsercizioMedio;

import java.util.Scanner;

public class MainComputer {

    //controller
    public static void main(String[] args) {
        // Inizializzo i componenti
        Scanner scanner = new Scanner(System.in);
        ComputerFacade pc = new ComputerFacade();
        ComputerView view = new ComputerView();

        while (true) {
            view.mostraMenu();
            String scelta = scanner.nextLine();

            if (scelta.equals("0")) {
                break;
            }

            BootStrategy strategia = null;
            if (scelta.equals("1")) {
                strategia = new FastBoot();
            } else if (scelta.equals("2")) {
                strategia = new SafeBoot();
            } else {
                view.messaggioErrore();
                continue;
            }

            // Il Controller invia il comando al Model
            pc.accendiComputer(strategia);
        }

        System.out.println("Chiusura sistema.");
    }
}
