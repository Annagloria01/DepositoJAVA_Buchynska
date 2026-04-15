
import java.util.Scanner;

public class ElseEsercizio {
    
    public static void main(String[] args) {
        Scanner inString = new Scanner(System.in);
        Scanner inint = new Scanner(System.in);
        
        System.out.println("Inserisci la tua età");
        int userAge = inint.nextInt();
        
        System.out.println("Hai un biglietto valido? (si/no)");
        String ticket = inString.nextLine();
        
        System.out.println("Sei accompaganto da un adulto? (si/no)");
        String isAccompanied = inString.nextLine();
       
        System.out.println("Hai acquistato l'opzione salta la fila? (si/no)");
        String skipLine = inString.nextLine();

        if(ticket.equals("si")){
            System.out.println("Puoi entrare");
        } else {
            System.out.println("Non puoi entrare");
        }

        if(isAccompanied.equals("si")){
            System.out.println("Sei accompagnato");
        } else {
            System.out.println("Non sei accompagnato");
        }

        if(skipLine.equals("si")){
            System.out.println("Puoi saltare la fila");
        } else {
            System.out.println("Non puoi saltare la fila");
        }
    }
}
