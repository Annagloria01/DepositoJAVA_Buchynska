
import java.util.Scanner;

public class EsercizioVoti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti voti vuoi inserire?");
        int numeroVoti = scanner.nextInt();

        double[] voti = new double[numeroVoti];
        double somma = 0;

        //inserimento voti
        for (int i = 0; i < numeroVoti; i++) {
            System.out.println("Inserisci il voto " + (i + 1) + ":");
            voti[i] = scanner.nextDouble();
            somma += voti[i];
        }

        int scelta = 0;
        while (scelta != 5) { //il ciclo continua finché l'utente non sceglie di uscire
            System.out.println("1 -Calcola media");
            System.out.println("2 - Mostra voto più alto");
            System.out.println("3 - Mostra voto più basso");
            System.out.println("4 - Verifica la promozione");
            System.out.println("5 - Esci");

            System.out.println("Scegli un'opzione:");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("La media è: " + calcoloMedia(somma, numeroVoti));
                    break;
                case 2:
                    System.out.println("Il voto più alto è: " + trovaVotoPiuAlto(voti));
                    break;
                case 3:
                    System.out.println("Il voto più basso è: " + trovaVotoPiuBasso(voti));
                    break;
                case 4:
                    verificaPromozione(calcoloMedia(somma, numeroVoti));
                    break;
                case 5:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        }
        
        //METODI//
        

    }

    public static double  calcoloMedia(double somma, int numeroVoti) {
        return somma / numeroVoti;
    }

    public static double trovaVotoPiuAlto(double[] voti) {
        double max = voti[0];
        for (double voto : voti) {
            if (voto > max) {
                max = voto;
            }
        }
        return max;
    }

    public static double trovaVotoPiuBasso(double[] voti) {
        double min = voti[0];
        for (double voto : voti) {
            if (voto < min) {
                min = voto;
            }
        }
        return min;
    }

    public static void verificaPromozione(double media) {
        if (media >= 6) {
            System.out.println("Promosso!");
        } else {
            System.out.println("Bocciato!");
        }
    }
}
