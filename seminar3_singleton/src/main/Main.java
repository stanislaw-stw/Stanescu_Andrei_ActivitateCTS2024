package main;

import clase.ConexiuneBazeDeDate;

public class Main {

    public static void main(String[] args) {
        ConexiuneBazeDeDate conexiune1 = ConexiuneBazeDeDate.getInstance("Baza1", 20, "link1");
        ConexiuneBazeDeDate conexiune2 = ConexiuneBazeDeDate.getInstance("Baza2", 50, "link2");

        conexiune1.setNumeBaza("NumeBazaNoua");
        conexiune2.setNumeBaza("NumeBazaNoua2");


        System.out.println(conexiune1);
        System.out.println(conexiune2);
    }
}
