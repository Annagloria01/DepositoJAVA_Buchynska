
class TicketSystemFacade {

    private TicketRepository repo = TicketRepository.getInstance();

    public void creaTicket(String desc, Observer utente) {
        repo.aggiungi(TicketFactory.create(desc, utente));
    }

    public void risolviTicket(int id) {
        Ticket t = repo.cercaPerId(id);
        if (t != null) {
            new RisoluzioneStandard().applica(t);
        } else {
            System.out.println("Ticket non trovato.");
        }
    }

    public void eliminaTicket(int id) {
        repo.elimina(id);
    }

    public void visualizzaTutti() {
        if (repo.getTutti().isEmpty()) {
            System.out.println("Nessun ticket presente.");
        } else {
            for (Ticket t : repo.getTutti()) {
                System.out.println("ID: " + t.getId() + " | Desc: " + t.getDescrizione() + " | Stato: " + t.getStato());
            }
        }
    }
}
