package cts.Stanescu.Andrei.as.patterns.Facade;

public class Main {
    public static void main(String[] args) {
        SpalatoriaAutoFacade spalatoria = new SpalatoriaAutoFacade();


        System.out.println("Spalare simpla pentru Masina 1:");
        spalatoria.doarSpalare();

        System.out.println("\nSpalare cu degresare pentru Masina 2:");
        spalatoria.spalareCuDegresare();

        System.out.println("\nSpalare completa pentru Masina 3:");
        spalatoria.spalareCompleta();


    }
}

