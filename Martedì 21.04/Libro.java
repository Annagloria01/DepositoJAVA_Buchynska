public class Libro {//variabile di istanza
    String titolo;
    String autore;
    double prezzo;
    int codice;
    

    static int contatoreCodice = 1;//variabile di classe statica per tenere traccia del codice

    Libro(String titolo, String autore, double prezzo){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.codice = contatoreCodice;
        contatoreCodice++;//incrementa il contatore per il prossimo libro
    }

    void stampaDettagli() {
        System.out.println("Libro " + codice + ": " + titolo + " " + autore  + prezzo);
}
}