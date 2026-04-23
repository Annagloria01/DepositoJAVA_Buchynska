
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Arraylist di Animale con cani e gatti
        ArrayList<Animale> animali = new ArrayList<>();
        
        // Aggiungiamo cani e gatti alla stessa lista
        animali.add(new Cane("Rex", 4));
        animali.add(new Gatto("Birba", 2));
        animali.add(new Cane("Thor", 7));

        //ciclo per stampare nome, età e verso di ogni animale
        for (Animale a : animali) {
            System.out.print("Nome: " + a.nome + ", Età: " + a.eta + " | Verso: ");
            a.faiVerso(); 
        }

       //zoo
        Zoo mioZoo = new Zoo();
        mioZoo.riempiZoo();
        mioZoo.stampaTutto();
    }
}
