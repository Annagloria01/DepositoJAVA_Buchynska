
import java.util.Scanner; //Scanner è una classe

public class EsempiScanner {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Creiamo il nostro nuovo oggetto scanner
        System.out.println("Enter username");//Cosa deve fare l'utente.

        String userName = myObj.nextLine();// prendiamo un valore inserito dall'utente  
        System.out.println("Username is: " + userName);

        Scanner myObj2 = new Scanner(System.in); 
        System.out.println("Metti un numero");
        int num = myObj2.nextInt();
        System.out.println("Il numero è: " + num);
    }

}
