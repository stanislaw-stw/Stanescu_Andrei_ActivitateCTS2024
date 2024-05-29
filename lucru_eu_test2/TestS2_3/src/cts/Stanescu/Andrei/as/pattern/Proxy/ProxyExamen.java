package cts.Stanescu.Andrei.as.pattern.Proxy;

public class ProxyExamen implements InterfataExamen {
    private InterfataExamen examenReal;

    public ProxyExamen() {
        this.examenReal = new ExamenReal();
    }

    @Override
    public void sustineExamen(Student student) {
        if (student.getPunctaj() >= 2) {
            examenReal.sustineExamen(student);
        } else {
            System.out.println("Studentul " + student.getNume() + " nu poate sustine examenul acum, va trebui sa astepte sesiunea de restante.");
        }
    }
}

