
import java.util.Scanner;

public class SistemaSemplice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uso di due liste separate: una per i nomi e una per le password
        String[] listaNomi = new String[100];
        String[] listaPassword = new String[100];
        int utentiSalvati = 0;// Contatore per tenere traccia di quanti utenti sono stati salvati

        boolean continuaProgramma = true;// Variabile di controllo per il ciclo del menu

        while (continuaProgramma == true) {// Ciclo del menu principale
            System.out.println("--- COSA VUOI FARE? ---");
            System.out.println("1) Crea Account");
            System.out.println("2) Entra nel Sistema");
            System.out.println("3) Chiudi");

            String scelta = scanner.nextLine();// Leggo la scelta dell'utente

            if (scelta.equals("1")) {// Se l'utente sceglie di creare un account
                // --- REGISTRAZIONE ---
                System.out.print("Scegli il tuo nome: ");
                String nomeScelto = scanner.nextLine();

                // Controllo se il nome esiste già usando un ciclo for
                boolean trovato = false;// Variabile di controllo per sapere se il nome è stato trovato
                for (int i = 0; i < utentiSalvati; i++) {
                    if (listaNomi[i].equals(nomeScelto)) {
                        trovato = true;
                    }
                }

                if (trovato == true) {// Se il nome è stato trovato, avviso l'utente
                    System.out.println("Spiacente, il nome esiste gia'.");
                } else {
                    // Salviamo il nome nella posizione corrente
                    listaNomi[utentiSalvati] = nomeScelto;

                    System.out.print("Scegli la password: ");
                    String passScelta = scanner.nextLine();
                    // Salviamo la password nella stessa posizione del nome
                    listaPassword[utentiSalvati] = passScelta;

                    // Aumento il numero di utenti 
                    utentiSalvati = utentiSalvati + 1;
                    System.out.println("Account creato!");
                }

            } else if (scelta.equals("2")) {// Se l'utente sceglie di accedere al sistema
                // --- ACCESSO ---
                System.out.print("Inserisci Nome: ");
                String nomeLogin = scanner.nextLine();
                System.out.print("Inserisci Password: ");
                String passLogin = scanner.nextLine();

                boolean loginOk = false;// Variabile di controllo per sapere se il login è stato effettuato con successo

                // Cerco nelle liste se esiste questa coppia nome/pass
                for (int i = 0; i < utentiSalvati; i++) {
                    if (listaNomi[i].equals(nomeLogin) && listaPassword[i].equals(passLogin)) {
                        loginOk = true;
                    }
                }

                if (loginOk == true) {
                    System.out.println("Benvenuto nel sistema!");
                    eseguiCalcoli(scanner);
                } else {
                    System.out.println("Nome o password sbagliati.");
                }

            } else if (scelta.equals("3")) {// Se l'utente sceglie di chiudere il programma
                continuaProgramma = false;
                System.out.println("Arrivederci!");
            }
        }
    }

    public static void eseguiCalcoli(Scanner s) {// Metodo per eseguire i calcoli dopo il login
        String[] memoriaRisultati = new String[4];
        int conta = 0; // Contatore manuale

        while (conta < 4) {// Ciclo per eseguire al massimo 4 operazioni
            System.out.println("--- OPERAZIONE " + (conta + 1) + " DI 4 ---");
            System.out.println("Scegli: 1.Piu, 2.Meno, 3.Per, 4.Diviso, 5.Potenza");
            System.out.println("Oppure digita 0 per uscire e tornare al menu.");

            String sceltaOp = s.nextLine();

            // Se l'utente sceglie di uscire
            if (sceltaOp.equals("0")) {
                System.out.println("Uscita dalla calcolatrice...");
                break;
            }

            // Chiediamo i numeri solo se non è uscito
            System.out.print("Numero A: ");
            double a = Double.parseDouble(s.nextLine());
            System.out.print("Numero B: ");
            double b = Double.parseDouble(s.nextLine());

            double risultato = 0;
            String operatore = "";

            boolean operazioneValida = true;// Variabile di controllo per sapere se l'operazione scelta è valida

            switch (sceltaOp) {// Eseguiamo l'operazione scelta
                case "1":
                    risultato = a + b;
                    operatore = " + ";// Spazio per rendere più leggibile il risultato
                    break;
                case "2":
                    risultato = a - b;
                    operatore = " - ";
                    break;
                case "3":
                    risultato = a * b;
                    operatore = " * ";
                    break;
                case "4":
                    risultato = a / b;
                    operatore = " / ";
                    break;
                case "5":
                    risultato = Math.pow(a, b);
                    operatore = " ^ ";
                    break;
                default:
                    System.out.println("Scelta errata! Riprova.");// Se l'utente ha inserito una scelta non valida, viene avvisato e non si salva nulla in memoria
                    operazioneValida = false; 
                    break;
            }

            if (operazioneValida == true) {// Se l'operazione è valida, mostriamo il risultato e lo salviamo in memoria
                System.out.println("Risultato: " + risultato);
                memoriaRisultati[conta] = a + operatore + b + " = " + risultato;
                conta++;
            }
        }

        System.out.println("--- RIEPILOGO OPERAZIONI EFFETTUATE ---");

        // Usiamo 'conta' per sapere quante operazioni mostrare davvero
        for (int i = 0; i < conta; i++) {
            System.out.println("Operazione " + (i + 1) + ": " + memoriaRisultati[i]);
        }

        System.out.println("Sessione terminata. Verrai riportato al menu.");// Messaggio di fine sessione
    }
}
