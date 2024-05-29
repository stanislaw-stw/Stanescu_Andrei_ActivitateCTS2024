package facade.autobuz;

public class FacadeAutobuz {
    private Autobuz autobuz;
    public FacadeAutobuz(Autobuz autobuz){
        this.autobuz=autobuz;
    }
    public void deschideToateUsile(){
        this.autobuz.deschideUsaFata();
        this.autobuz.deschideUsaMijloc();
        this.autobuz.deschideUsaSpate();
    }
    public void eliberareToateUsile(){
        this.autobuz.punePeLiberUsaDinFata();
        this.autobuz.punePeLiberUsaDinMijloc();
        this.autobuz.punePeLiberUsaDinSpate();
    }
}
