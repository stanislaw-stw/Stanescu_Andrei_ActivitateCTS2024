package Strategy.classes;

public class VerificatorPeluza implements  Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("Se verifica bagajele si hainele pentru: "+nume);
    }
}
