public class EsercizioFunzioni {
    public static int calcoloFattoriale(int numero) {
        int risultato = 1;
        for (int i = 1; i <= numero; i++) {
            risultato *= i;
        }
        return risultato;
    }
    //overloading
    public static void calcolaFattoriale (String s){
        System.out.println("Inserisci un numero valido per calcolare il fattoriale:"); 
    }

    public static void main(String[] args) {
            int f = calcoloFattoriale(5);
            System.out.println("Il fattoriale di 5 è: " + f);

            //chiamo lo stesso metodo con un parametro di tipo diverso
            calcolaFattoriale("test");
        }

}
