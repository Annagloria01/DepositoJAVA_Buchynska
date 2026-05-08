// L'utente concreto che riceve le notifiche

class Utente implements Observer {

    private String nome;

    public Utente(String nome) {
        this.nome = nome;
    }

    @Override
    public void notifica(String messaggio) {
        System.out.println("\n[NOTIFICA PER " + nome.toUpperCase() + "]: " + messaggio);
    }
}
