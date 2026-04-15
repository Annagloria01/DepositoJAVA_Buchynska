public class EsercizioSwitch {
    public static void main(String[] args) {
        int day = 4;

        switch (day) { //un caso per ogni possibile valore della variabile day
            case 1:
                System.out.println("Monday");
                break; //se un caso è vero, esegue il codice e poi esce dallo switch
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}