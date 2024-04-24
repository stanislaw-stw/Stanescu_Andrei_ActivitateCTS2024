package Strategy;

import Strategy.classes.*;

public class Main {
    public static void main(String[] args) {
        Portar portar = new Portar();
        String suporter1 = "GigelVip";
        String suporter2 = "GigelPeluza";
        String suporter3 = "GigelTribuna";

        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter2);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter3);
    }
}