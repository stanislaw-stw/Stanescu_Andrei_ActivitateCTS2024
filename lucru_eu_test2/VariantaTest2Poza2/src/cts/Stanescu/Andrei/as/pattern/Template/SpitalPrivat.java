package cts.Stanescu.Andrei.as.pattern.Template;

public class SpitalPrivat extends Spital {
    protected void verificareSemneVitale(Pacient pacient) {
        System.out.println("Verificare semne vitale in spital privat.");
    }

    protected void interventieUrgenta(Pacient pacient) {
        System.out.println("Chemare echipa externa de medici pentru stabilizare in spital privat.");
    }

    protected void programareMedicFamilie() {
        System.out.println("Programare medic de familie din reteaua privata.");
    }

    protected void verificareLocInternare() {
        System.out.println("Cautare loc pentru internare in spitalele private sau alte spitale de stat.");
    }
}
