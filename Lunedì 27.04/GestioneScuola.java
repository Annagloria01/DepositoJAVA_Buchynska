
import java.util.ArrayList;
import java.util.Scanner;

public class GestioneScuola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner per input da console
        ArrayList<Studente> elencoStudenti = new ArrayList<>();
        ArrayList<Docente> elencoDocenti = new ArrayList<>();

        while (true) { // ciclo infinito per il menu, si esce con scelta 0
            System.out.println("1. Inserisci Studente");
            System.out.println("2. Inserisci Docente");
            System.out.println("3. Assegna Studente a un Docente");
            System.out.println("4. Assegna Voto ");
            System.out.println("5. Visualizza Info ");
            System.out.println("0. Esci");
            
            int scelta = sc.nextInt(); 
            sc.nextLine(); 
            if (scelta == 0) break; // esce dal programma

            switch (scelta) { // gestione delle scelte del menu
                case 1: // inserimento studente
                    System.out.print("Nome: "); String ns = sc.nextLine();
                    System.out.print("Età: "); int es = sc.nextInt(); sc.nextLine();
                    System.out.print("Classe: "); String cl = sc.nextLine();
                    elencoStudenti.add(new StudenteLiceale(ns, es, cl));
                    break;

                case 2: // inserimento docente
                    System.out.print("Nome: "); String nd = sc.nextLine();
                    System.out.print("Età: "); int ed = sc.nextInt(); sc.nextLine();
                    System.out.print("Materia: "); String mat = sc.nextLine();
                    elencoDocenti.add(new DocenteOrdinario(nd, ed, mat));
                    break;

                case 3: // assegnazione studenti a docenti
                    System.out.println("Scegli Docente:");
                    for(int i=0; i<elencoDocenti.size(); i++) System.out.println(i + ". " + elencoDocenti.get(i).getNome());
                    int dId = sc.nextInt();
                    System.out.println("Scegli Studente:");
                    for(int i=0; i<elencoStudenti.size(); i++) System.out.println(i + ". " + elencoStudenti.get(i).getNome());
                    int sId = sc.nextInt();
                    elencoDocenti.get(dId).aggiungiStudente(elencoStudenti.get(sId));
                    break;

                case 4: // assegnazione voti
                    System.out.println("Quale docente sta valutando?");
                    for(int i=0; i<elencoDocenti.size(); i++) System.out.println(i + ". " + elencoDocenti.get(i).getNome());
                    int dVoto = sc.nextInt();
                    System.out.println("A quale studente?");
                    for(int i=0; i<elencoStudenti.size(); i++) System.out.println(i + ". " + elencoStudenti.get(i).getNome());
                    int sVoto = sc.nextInt();
                    System.out.print("Voto: "); int v = sc.nextInt();
                    elencoDocenti.get(dVoto).assegnaVoto(elencoStudenti.get(sVoto), v);
                    break;

                case 5: // visualizzazione info studente da parte del docente
                    System.out.println("Docente richiedente:");
                    for(int i=0; i<elencoDocenti.size(); i++) System.out.println(i + ". " + elencoDocenti.get(i).getNome());
                    int dInfo = sc.nextInt();
                    System.out.println("Studente da analizzare:");
                    for(int i=0; i<elencoStudenti.size(); i++) System.out.println(i + ". " + elencoStudenti.get(i).getNome());
                    int sInfo = sc.nextInt();
                    elencoDocenti.get(dInfo).visualizzaInfoStudente(elencoStudenti.get(sInfo));
                    break;
            }
        }
    }
}