public class Esercizio3 {
    public static int calcolaNumeriInteri(int a){
        //caso base
        if(a <=1){
            return 1;
        }
        //caso ricorsivo
        return a * calcolaNumeriInteri(a - 1);
    }
}
