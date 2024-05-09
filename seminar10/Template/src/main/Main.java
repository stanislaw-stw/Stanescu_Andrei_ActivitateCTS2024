package main;

import classes.Pacient;
import classes.SpitalPublic;

public class Main {
    public static void main(String[] args) {
        SpitalPublic spitalPublic = new SpitalPublic("COLTEA",2);
        Pacient pacient = new Pacient("Gheorghe",3);
        Pacient pacient2 = new Pacient("Gheo",1);
        Pacient pacient3 = new Pacient("Ion",2);

        spitalPublic.internare(pacient);
        spitalPublic.internare(pacient2);
        spitalPublic.internare(pacient3);
    }
}