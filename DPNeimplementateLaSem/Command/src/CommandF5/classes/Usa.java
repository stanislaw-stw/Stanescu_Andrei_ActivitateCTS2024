package CommandF5.classes;

public class Usa {
    private String pozitie;

    public Usa(String pozitie) {
        this.pozitie = pozitie;
    }

    public void deschideFortat() {
        System.out.println("Deschide fortat usa " + pozitie);
    }

    public void puneInModLiber() {
        System.out.println("Pune usa " + pozitie + " in mod liber");
    }
}

