
// Factory method 
class TicketFactory {

    private static int counter = 1;

    public static Ticket create(String desc, Observer proprietario) {
        return new Ticket(counter++, desc, proprietario);
    }
}
