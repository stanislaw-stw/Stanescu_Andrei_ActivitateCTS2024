package cts.Stanescu.Andrei.as.pattern.Proxy;

public class Student {
    private String nume;
    private int punctaj;

    public Student(String nume, int punctaj) {
        this.nume = nume;
        this.punctaj = punctaj;
    }

    public String getNume() {
        return nume;
    }

    public int getPunctaj() {
        return punctaj;
    }
}

