class Suite extends Camera {
    private String serviziExtra;

    // Costruttore
    public Suite(int numero, float prezzo, String serviziExtra) {
        super(numero, prezzo);
        this.serviziExtra = serviziExtra;
    }

    // Getter e Setter per serviziExtra
    public String getServiziExtra() { 
        return serviziExtra; 
    }
    
        public void setServiziExtra(String serviziExtra) { 
            this.serviziExtra = serviziExtra; 
        }

    // Override del metodo dettagli() per includere i servizi extra
    @Override
    public void dettagli() {
        // Usa super per chiamare il metodo della classe base
        System.out.print("SUITE -> ");
        super.dettagli(); 
        System.out.println("   [Servizi Extra: " + serviziExtra + "]");
    }
}