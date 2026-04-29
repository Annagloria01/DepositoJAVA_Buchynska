/* public class EsempiPattern1 {
        //Definizione della classe Singleton
        private static Singleton instance;

        //costruttore privato per impedire l'instanziazione esterna
        private Singleton() {};

        //metodo pubblico statico per ottenere l'istanza unica della classe
        public static Singleton getInstance() {
            //se l'istanza non esiste viene creata
            if (instance == null) {
                instance = new Singleton();
            }
            //restituisce l'istanza esistente on appena creata
            return instance;
        }
    }

    public class Main {
        public static void main(String[] args) {
            //metodo di esempio che può essere chiamato sull'istanza Singleton
           public void Dosomething() {
                System.out.println("Esempio di metodo chiamato sull'istanza Singleton");
            }
    }

 */