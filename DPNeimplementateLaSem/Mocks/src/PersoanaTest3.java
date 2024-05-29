//import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.Test;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PersoanaTest3 {
//    @Test
//    public void testDummyObject() {
//        IPersoana dummyPerson = mock(IPersoana.class);
//        Companie companie = new Companie();
//        List<IPersoana> angajati = new ArrayList<>();
//        angajati.add(dummyPerson);
//        companie.setAngajati(angajati);
//
//        assertEquals(1, companie.getNumarAngajati());
//    }
//
//    @Test
//    public void testStub() {
//        IPersoana stubPerson = new IPersoana() {
//            @Override
//            public String getSex() {
//                return "M";
//            }
//
//            @Override
//            public int getVarsta() {
//                return 25;
//            }
//
//            @Override
//            public boolean checkCNP() {
//                return true;
//            }
//        };
//        assertEquals(25, stubPerson.getVarsta());
//    }
//
//    @Test
//    public void testSpy() {
//        Persoana realPerson = new Persoana("Ion", "1980526430018");
//        Persoana spyPerson = spy(realPerson);
//        doReturn(30).when(spyPerson).getVarsta();
//
//        assertEquals(30, spyPerson.getVarsta());
//    }
//
//    @Test
//    public void testFake() {
//        IPersoana fakePerson = new IPersoana() {
//            @Override
//            public String getSex() {
//                return "F";
//            }
//
//            @Override
//            public int getVarsta() {
//                return 20;
//            }
//
//            @Override
//            public boolean checkCNP() {
//                return false;
//            }
//        };
//        assertEquals(20, fakePerson.getVarsta());
//    }
//
//    @Test
//    public void testMock() {
//        IPersoana mockPerson = mock(IPersoana.class);
//        when(mockPerson.getVarsta()).thenReturn(40);
//
//        assertEquals(40, mockPerson.getVarsta());
//    }
//}
