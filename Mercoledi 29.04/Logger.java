
import java.util.Date;

public class Logger {

    //istanza privata statica della classe Logger
    private static Logger instanza;

    //costruttore privato per impedire l'instanziazione diretta
    private Logger() {
    }

    //metodo pubblico statico per ottenere l'istanza della classe Logger
    public static Logger getInstanza() {

        //se l'istanza non esiste, viene creata una nuova istanza
        if (instanza == null) {
            instanza = new Logger();
        }

        //restituisce l'istanza della classe Logger
        return instanza;
    }

    public void Scrivimessaggio(String messaggio) {
        System.out.println(new Date() + " " + messaggio);
    }

    @Override
    public String toString() {
        return "sono uguali";
    }
}
