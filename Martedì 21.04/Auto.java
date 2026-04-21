public class Auto {
    String targa;
    String modello;

    public Auto(String targa, String modello) {
        this.targa = targa;
        this.modello = modello;
    }

    @Override //toString() per rappresentare l'auto come stringa
    public String toString() {
        return "Targa: " + targa + " | Modello: " + modello;
    }

    @Override //hashCode() basato sulla targa, poiché è un identificatore unico
    public int hashCode() {
        return targa.hashCode();
    }

    @Override //equals() per confrontare due auto basandosi sulla targa
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;//controlla se l'oggetto è null o di classe diversa
        Auto auto = (Auto) obj;//converte l'oggetto in un'istanza di Auto
        return targa.equals(auto.targa);
    }

}
