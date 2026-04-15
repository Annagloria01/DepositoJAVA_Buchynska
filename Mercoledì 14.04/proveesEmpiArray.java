
public class proveesEmpiArray {

    //Un array è una collezione ordinata a dimensione fissa di
    //elementi dello stesso tipo.
    //Si dichiara usando le parentesi quadre [].
    //L’indicizzazione parte da 0.
    //La dimensione dell’array non può cambiare
    public static void main(String[] args) {
        // Dichiarazione e inizializzazione
        int[] numeri = new int[5];

        // Array di dimensione 5
        int[] valori = {1, 2, 3, 4, 5};

        //For each di array
        for (int i : valori) {
            System.out.println(valori[i - 1]);
            //-1 perché l’indice parte da 0, quindi per accedere al primo elemento (1) 
            // dobbiamo usare l’indice 0, per il secondo elemento (2) l’indice 1, e così via. 
            // Quindi devo rispettare il modo in cui "conta" l'array
        }

        //Un array multidimensionale o matrice multidimensionali è un array di array, e si 
        // dichiara usando più parentesi quadre [][].
        // Array 2D
        int[][] matrice = new int[3][3];

        // Inizializzazione diretta
        int[][] matricePredefinita = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Elemento centrale: " + matrice[1][1]);

    }
    }

