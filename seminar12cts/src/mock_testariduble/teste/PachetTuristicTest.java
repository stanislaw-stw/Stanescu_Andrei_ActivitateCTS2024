package mock_testariduble.teste;


import mock_testariduble.clase.IPersoana;
import mock_testariduble.clase.PachetTuristic;
import mock_testariduble.clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import mock_testariduble.teste.categorii.CuMock;
import mock_testariduble.teste.categorii.FaraMock;
import mock_testariduble.teste.dubluri.PersoanaFake;

import static org.junit.Assert.assertEquals;


public class PachetTuristicTest{

    @Test
    @Category(FaraMock.class)
    public void testeazaCorectitudineAplicaDiscount(){
        IPersoana client = new Persoana("Ion","12403236254373");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Destinaite 1", 22.5);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(18.0, pachetTuristic.getPret(), 0.01);

    }

    @Test
    @Category(FaraMock.class)
    public void aplicaDiscountBoundary(){
        IPersoana client = new Persoana("Dan", "159020476448933");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 33.5);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30.15, pachetTuristic.getPret(), 0.01);

    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscountFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(27, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareNuAplicaDiscountFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(25);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscount100(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscount0(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(30.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscount1(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(1);
        assertEquals(29.7,pachetTuristic.getPret(),0.01);
    }
}