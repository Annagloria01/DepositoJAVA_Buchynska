package piattaformaNotifiche;

public class utente implements UtentiObserver{

    private String nome;

    public utente(String nome){
        this.nome = nome;
    }

    //interfaccia observer
    @Override
    public void update(String messaggio) {
        // Aggiungiamo il nome davanti al messaggio
        System.out.println(this.nome + ": " + messaggio);
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
}
