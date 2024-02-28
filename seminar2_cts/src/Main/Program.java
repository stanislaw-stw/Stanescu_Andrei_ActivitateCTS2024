package Main;

import clase.Angajat;
import clase.Aplicant;
import clase.readers.classes.AngajatReader;
import clase.readers.intarfaces.ApplicantReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ApplicantReader angajatReader = new AngajatReader("angajati.txt");

		try {
			listaAngajati = angajatReader.read();
			for(Aplicant angajat : listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
