package clase;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest2 {

    @org.junit.Test
    public void getSexReturnF() {
        Persoana pers1 = new Persoana("Simona", "60950530303");
        assertEquals(pers1.getSex(), "F");
    }

    @org.junit.Test
    public void getSexReturnM(){
        Persoana pers23 = new Persoana("Alex", "550954544303");
        assertEquals(pers23.getSex(), "M");
    }

    @Test
    public void  getSexReturnLimitaInferioara(){
        Persoana pers3 = new Persoana("Andrei", "1095333300");
        assertEquals(pers3.getSex(), "M");
    }

    @Test
    public void getSexParitate(){
        String cnp = "102452350090";
        Persoana pers4 = new Persoana("Andrei", cnp);
        String sex;
        if(Integer.valueOf(cnp.charAt(0)) %2 == 0){
            sex = String.valueOf("F");
        } else {
            sex = String.valueOf("M");
        }
        assertEquals(pers4.getSex(), sex);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorCNPStartWithNumberOutsideCases(){
        Persoana pers4 = new Persoana("Andrei", "90953333090");
        pers4.getSex();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorStartWithInvalidCharacter(){
        Persoana pers4 = new Persoana("Andrei", "-0953333090");
        pers4.getSex();
    }

    @Test(expected = NullPointerException.class)
    public void getSexErrorCNPIsEmptyString(){
        Persoana pers4 = new Persoana("Andrei", " ");
        pers4.getSex();
    }

    @Test(timeout = 200)
    public void getSexPerformance(){
        Persoana persoana =  new Persoana("Andrei", "1294325532");
        persoana.getSex();

    }

    @Test
    public void getSexCorrectByLetter(){
        Persoana pers1 = new Persoana("Andrei", "12988530303");
        boolean isCorrect = pers1.getSex().toLowerCase().equals("m") || pers1.getSex().toLowerCase().equals("f");
        assertTrue(isCorrect);
    }

    @Test
    public void getSexOrder(){
        Persoana persoana = new Persoana("Andrei", "10288530303");
        Persoana persoana1 = new Persoana("Simona", "60288530303");

        assertTrue(persoana.getSex().compareTo(persoana1.getSex()) > 0);
    }

    @Test
    public void getSexRange(){
        Persoana pers1 = new Persoana("Simona", "80288530303");
        assertEquals(true, pers1.getSex().equals("F"));
    }

    @Test(expected = NullPointerException.class)
    public void getSexExistence(){
        Persoana pers1 = new Persoana("Simona", null);
        pers1.getSex();
    }
    @Test(expected = IllegalArgumentException.class)
    public void getSexCardinality(){
        Persoana pers1 = new Persoana("Simona", "0000000000");
        pers1.getSex();
    }
}