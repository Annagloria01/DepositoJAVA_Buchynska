class Camera {
    protected int numero;
    protected float prezzo;

    // Costruttore
    public Camera(int numero, float prezzo) {
        this.numero = numero;
        this.prezzo = prezzo;
    }

    // Getter e Setter
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public float getPrezzo() { return prezzo; }
    public void setPrezzo(float prezzo) { this.prezzo = prezzo; }

    // Overload Metodo dettagli() - Forma 1 (senza parametri)
    public void dettagli() {
        System.out.println("Camera n. " + numero + " | Prezzo: " + prezzo + "€");
    }

    // Overload Metodo dettagli() - Forma 2 (con parametro booleano)
    public void dettagli(boolean conPrezzo) {
        if (conPrezzo) {
            this.dettagli(); // Chiama la forma 1
        } else {
            System.out.println("Camera n. " + numero);
        }
    }
}