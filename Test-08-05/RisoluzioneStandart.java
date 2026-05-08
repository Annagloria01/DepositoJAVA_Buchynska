
class RisoluzioneStandard implements RisoluzioneStrategy {

    public void applica(Ticket t) {
        t.setStato("RISOLTO");
        // Quando lo stato cambia, l'Observer viene notificato
        t.getProprietario().notifica("Il tuo ticket #" + t.getId() + " è stato risolto!");
    }
}
