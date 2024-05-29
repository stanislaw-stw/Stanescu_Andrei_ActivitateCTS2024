package cts.Stanescu.Andrei.as.pattern.Strategy;

public class Main {
    public static void main(String[] args) {
        Masina masina1 = new Masina("Dacia");
        Masina masina2 = new Masina("BMW");
        Masina masina3 = new Masina("Audi");
        Masina masina4 = new Masina("Volkswagen");
        Masina masina5 = new Masina("Ford");

        masina1.setModSpalare(new SpalareExterior());
        masina1.spalaMasina();

        masina2.setModSpalare(new SpalareInterior());
        masina2.spalaMasina();

        masina3.setModSpalare(new SpalareCompleta());
        masina3.spalaMasina();

        masina4.setModSpalare(new SpalareExterior());
        masina4.spalaMasina();
        masina4.setModSpalare(new SpalareCompleta());
        masina4.spalaMasina();

        masina5.setModSpalare(new SpalareInterior());
        masina5.spalaMasina();
    }
}
