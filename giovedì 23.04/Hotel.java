import java.util.ArrayList;

class Hotel {
    private String nome;
    private ArrayList<Camera> listaCamere = new ArrayList<>();

    // Costruttore
    public Hotel(String nome) {
        this.nome = nome;
    }

    //metodi per aggiungere camere
    public void aggiungiCamera(Camera c) {
        listaCamere.add(c);
    }

    // Getter per listaCamere
    public ArrayList<Camera> getListaCamere() {
        return listaCamere;
    }

    // Metodo STATICO: non serve creare un oggetto Hotel per usarlo
    public static int contaSuite(ArrayList<Camera> lista) {
        int contatore = 0;
        for (Camera c : lista) {
            if (c instanceof Suite) {
                contatore++;
            }
        }
        return contatore;
    }
}