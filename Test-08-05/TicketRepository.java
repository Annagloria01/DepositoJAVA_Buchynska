
import java.util.ArrayList;

//singleton
class TicketRepository {

    private static TicketRepository instance;
    private ArrayList<Ticket> listaTicket = new ArrayList<>();

    private TicketRepository() {
    }

    public static TicketRepository getInstance() {
        if (instance == null) {
            instance = new TicketRepository();
        }
        return instance;
    }

    public void aggiungi(Ticket t) {
        listaTicket.add(t);
    }

    public ArrayList<Ticket> getTutti() {
        return listaTicket;
    }

    public void elimina(int id) {
        for (int i = 0; i < listaTicket.size(); i++) {
            if (listaTicket.get(i).getId() == id) {
                listaTicket.remove(i);
                return;
            }
        }
    }

    public Ticket cercaPerId(int id) {
        for (Ticket t : listaTicket) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}
