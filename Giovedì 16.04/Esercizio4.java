public class Esercizio4 {
    public static void main(String[] args) {
        // 1. Variabile primitiva
        int numero = 10;
        System.out.println("PRIMITIVA - Prima: " + numero);
        modificaPrimitiva(numero);
        System.out.println("PRIMITIVA - Dopo: " + numero); // Non cambia!

        System.out.println("---");

        // 2. Array (Oggetto)
        int[] voti = {1, 2, 3};
        System.out.println("ARRAY - Prima: " + voti[0]);
        modificaArray(voti);
        System.out.println("ARRAY - Dopo: " + voti[0]); // Cambia!
    }

    // Metodo che prova a modificare una primitiva
    public static void modificaPrimitiva(int n) {
        n = 500; 
    }

    // Metodo che modifica un elemento dell'array
    public static void modificaArray(int[] arr) {
        if (arr.length > 0) {
            arr[0] = 99;
        }
    }
}

