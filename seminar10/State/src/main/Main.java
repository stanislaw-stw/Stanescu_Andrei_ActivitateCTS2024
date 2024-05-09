package main;

import classes.Pacient;
import classes.Stare;
import classes.SubObservatie;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gheorghe");

        pacient.seAgraveazaStarea();
        pacient.vindecare();
        pacient.seImbunatatesteStarea();
        pacient.vindecare();

        Pacient pacient2 = new Pacient("Ghita");
        pacient2.seAgraveazaStarea();
        // pacient2.setStare(pacient.getStare()); NU MAI MERGE FIIND PROTECTED ACUM
        pacient2.seImbunatatesteStarea();
        pacient2.vindecare();



    }
}