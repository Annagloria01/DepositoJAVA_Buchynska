package FacadeEsercizioMedio;


public class ComputerView {

    //view
   public void mostraMenu() {
        System.out.println("Scegli come avviare il PC:");
        System.out.println("1) Avvio Rapido");
        System.out.println("2) Avvio Sicuro");
        System.out.println("0) Esci");
        System.out.print("Scelta: ");
    }

    public void messaggioErrore() {
        System.out.println("Opzione non valida!\n");
    }
}
