
public class EsempiCondizioni {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println(x > y); // maggiore
        System.out.println(x < y); // minore
        System.out.println(x >= y); // maggiore o uguale
        System.out.println(x <= y); // minore o uguale
        System.out.println(x == y); // uguale
        System.out.println(x != y); // diverso

        //CONDIZIONI IF-ELSE
        int a = 20;
        int b = 18;
        if (a > b) {
            System.out.println("a è maggiore di b");

        }
        //ELSE
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        //ELSE IF
        int timea = 22;
        if (timea < 10) {
            System.out.println("Good morning.");
        } else if (timea < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");

        }

    }
}
