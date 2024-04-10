package Main;

import Decorator.Decorator;
import Decorator.AplicatieMobila;
import Decorator.Website;

import Spital.Diagnostic;
import Spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diganostic = new Diagnostic("Raceala","Rosu in gat", false);
        diganostic.printeazaDiagnostic();

        Decorator decorator = new AplicatieMobila(diganostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnostic();

        Decorator webSite = new Website(diganostic);
        webSite.afiseazaOnline();;
        webSite.printeazaDiagnostic();
    }
}