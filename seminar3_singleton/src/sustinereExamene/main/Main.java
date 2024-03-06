package sustinereExamene.main;

import sustinereExamene.Student;
import sustinereExamene.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Pop Denis", "popdenis123@stud.ase.ro", 3);
        Student student2 = new Student(126, "Pop Maria", "popmaria23@stud.ase.ro", 3);
        Student student3 = new Student(526, "Popescu Denis", "popescudenis23@stud.ase.ro", 3);
        Student student4 = new Student(986, "Popescu Diana", "popescudiana23@stud.ase.ro", 3);

        SustinereExamen examenPOO = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen examenCTS = new SustinereExamen("Calitatea si Testarea Software");

        examenPOO.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student2);
        examenPOO.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student3);
        examenPOO.inregistrareStudent(student4);
        examenPOO.inregistrareStudent(student2);

    }
}
