package Adapter.main;

import Adapter.classes.metrou.BiletMetrou;
import Adapter.classes.metrou.Calatorie;
import Adapter.classes.suprateran.AdapterCalatorie;
import Adapter.classes.suprateran.BiletCardCalatorii;
import Adapter.classes.suprateran.CardSTB;

public class Main {
    public static void validareIntrareMetrou(Calatorie calatorie) {
        if (calatorie.estePermisAccesl()) {
            System.out.println("Calatorie placuta!!");
        } else {
            System.out.println("Sold calatorii insuficiente!!");
        }
    }

    public static void validareUrcareSTB(CardSTB card) {
        card.validareCalatorie();
    }

    public static void main(String[] args) {
        Calatorie biletMetrou = new BiletMetrou("Ioana", 2);
//        validareIntrareMetrou(biletMetrou);
//        validareIntrareMetrou(biletMetrou);
//        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);
        CardSTB biletMixt = new AdapterCalatorie(biletMetrou);
        validareUrcareSTB(biletMixt);
        validareIntrareMetrou(biletMetrou);

    }
}
