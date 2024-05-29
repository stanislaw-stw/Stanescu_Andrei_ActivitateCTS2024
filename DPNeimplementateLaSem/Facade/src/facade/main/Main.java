package facade.main;

import facade.autobuz.Autobuz;
import facade.autobuz.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        System.out.println("fara facade");
        Autobuz autobuz=new Autobuz();
        autobuz.punePeLiberUsaDinFata();
        autobuz.punePeLiberUsaDinMijloc();
        autobuz.punePeLiberUsaDinSpate();
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
        System.out.println("cu facade%n%n");
        FacadeAutobuz facadeAutobuz=new FacadeAutobuz(autobuz);
        facadeAutobuz.eliberareToateUsile();
        facadeAutobuz.deschideToateUsile();
    }
}
