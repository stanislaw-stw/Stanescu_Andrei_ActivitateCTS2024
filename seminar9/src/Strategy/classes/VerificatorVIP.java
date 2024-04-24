package Strategy.classes;

public class VerificatorVIP implements Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("Este verificat biletul lui "+nume);
    }
}
