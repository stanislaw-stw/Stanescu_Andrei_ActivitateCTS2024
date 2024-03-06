package sustinereExamene;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {

    private String nume;

    Map<Integer, Student> listaStudenti1 = new HashMap<>();

    public SustinereExamen(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }



    public Map<Integer, Student> getListaStudenti1() {
        return listaStudenti1;
    }

    public void inregistrareStudent(Student student){
        if(listaStudenti1.containsKey(student.getId())){
            System.out.println("Studentul " + student.getNume() + " a sustinut deja examenul");
        } else {
            listaStudenti1.put(student.getId(), student);
            System.out.println("Studentul " + student.getNume() + " sustine examenul");
        }
    }
}
