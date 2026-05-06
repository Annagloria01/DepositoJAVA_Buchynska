package FacadeEsercizioMedio;

public class ComputerFacade {

    //Facade pattern

   private Bios bios = new Bios();
    private HardDisk hdd = new HardDisk();
    private SistemaOperativo os = new SistemaOperativo();

    public void accendiComputer(BootStrategy s) {
        System.out.println("\n--- " + s.getDettagli() + " ---");
        bios.inizializza();
        hdd.carica();
        os.avvia();
        System.out.println("----------------------------------\n");
    }
}
