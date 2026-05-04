public class Main {
    public static void main(String[] args) {
        // Creiamo il messaggio base
        Messaggio base = new MessaggioBase();
        
        // Lo "impacchettiamo" nel decoratore
        Messaggio decorato = new DecoratoreMaiuscolo(base);
        
        System.out.println(decorato.getContenuto());
    }
}
