package clase.readers.classes;

import clase.Aplicant;
import clase.Student;
import clase.readers.intarfaces.ApplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends ApplicantReader {
    public StudentReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));

        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student = new Student();
            super.readAplicant(input, student);

            int anStudii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setFacultate(facultate);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
