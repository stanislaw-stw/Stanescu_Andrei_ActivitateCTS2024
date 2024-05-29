package cts.Stanescu.Andrei.as.main;

import cts.Stanescu.Andrei.as.pattern.Observer.Profesor;
import cts.Stanescu.Andrei.as.pattern.Observer.StudentAlerts;
import cts.Stanescu.Andrei.as.pattern.Observer.StudentUpdates;
import cts.Stanescu.Andrei.as.pattern.Proxy.InterfataExamen;
import cts.Stanescu.Andrei.as.pattern.Proxy.ProxyExamen;
import cts.Stanescu.Andrei.as.pattern.Proxy.Student;

public class Main {
    public static void main(String[] args) {
        InterfataExamen examen = new ProxyExamen();
        examen.sustineExamen(new Student("Ion", 3));
        examen.sustineExamen(new Student("Ana", 1));
        examen.sustineExamen(new Student("Maria", 2));
        examen.sustineExamen(new Student("Dan", 0));
        examen.sustineExamen(new Student("Elena", 5));


        System.out.println("----------------");


        Profesor profesor = new Profesor();
        profesor.addObserver(new StudentAlerts("Ion"));
        profesor.addObserver(new StudentUpdates("Ana"));
        profesor.addObserver(new StudentAlerts("Maria"));
        profesor.addObserver(new StudentUpdates("Dan"));
        profesor.addObserver(new StudentAlerts("Elena"));

        profesor.anuntaModificare("Examenul se va sustine în sala 301.");
        profesor.anuntaModificare("Ora de examen a fost schimbata pentru ora 11.");
        profesor.anuntaModificare("Clarificari la subiectul 3.");
    }
}

