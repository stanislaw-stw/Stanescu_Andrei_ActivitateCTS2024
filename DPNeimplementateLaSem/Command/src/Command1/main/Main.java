package Command1.main;

import Command1.classes.*;

public class Main {
    public static void main(String[] args) {

        Operator operator = new Operator();

        PachetTuristic pachetTransport = new PachetTransport(1);
        PachetTuristic pachetCazare = new PachetCazare(2);

        Command comandaRezervareTransport = new ComandaRezervare(pachetTransport);
        Command comandaVanzareTransport = new ComandaVanzare(pachetTransport);

        Command comandaRezervareCazare = new ComandaRezervare(pachetCazare);
        Command comandaVanzareCazare = new ComandaVanzare(pachetCazare);

        operator.invoca(comandaRezervareTransport);
        operator.invoca(comandaVanzareTransport);
        operator.invoca(comandaRezervareCazare);
        operator.invoca(comandaVanzareCazare);

    }
}