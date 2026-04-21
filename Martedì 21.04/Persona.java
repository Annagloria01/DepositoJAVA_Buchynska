public class Persona {
    String nome;
    String città;
    int eta;

    Persona(String nome, String città, int eta){ //costruttore con tutti i parametri
        this.nome = nome;
        this.città = città;
        this.eta = eta;
    }

    Persona (String nome, String città){ //costruttore con nome e città, età di default a 0
        this.nome = nome;
        this.città = città;
        this.eta = 0; // Età di default se non specificata
    }

    Persona(){ //costruttore senza parametri, tutti i campi di default
        this.nome = "Sconosciuto";
        this.città = "Sconosciuto";
        this.eta = 0; 
    }

    void stampaDettagli() { //metodo per stampare i dettagli della persona
        System.out.println(nome + ", " + città + ", Età: " + eta);
    }
}
