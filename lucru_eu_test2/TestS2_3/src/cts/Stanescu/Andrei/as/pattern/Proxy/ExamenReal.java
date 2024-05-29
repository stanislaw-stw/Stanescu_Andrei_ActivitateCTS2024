package cts.Stanescu.Andrei.as.pattern.Proxy;

public class ExamenReal implements InterfataExamen {
    @Override
    public void sustineExamen(Student student) {
        System.out.println("Studentul " + student.getNume() + " a sustinut examenul.");
    }
}

