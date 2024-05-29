//
//import org.junit.Test;
//import org.mockito.Mockito;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
//
//public class PersoanaTest {
//
//    @Test
//    public void testDummyObject() {
//        IPersoana dummyPerson = mock(IPersoana.class);
//        Companie company = new Companie("Company", dummyPerson, 0);
//        assertNotNull(company);
//    }
//
//    @Test
//    public void testStub() {
//        IPersoana stubPerson = mock(IPersoana.class);
//        when(stubPerson.getVarsta()).thenReturn(33);
//        Companie company = new Companie("Company", stubPerson, 1000);
//        assertTrue(company.verificareLegalitate());
//    }
//
//    @Test
//    public void testSpy() {
//        IPersoana spyPerson = spy(new Persoana("Test", "1000000000001"));
//        doReturn(33).when(spyPerson).getVarsta();
//        Companie company = new Companie("Company", spyPerson, 1000);
//        assertTrue(company.verificareLegalitate());
//        verify(spyPerson, times(1)).getVarsta();
//    }
//
//    @Test
//    public void testFake() {
//        IPersoana fakePerson = new IPersoana() {
//            public String getSex() {
//                return "M";
//            }
//
//            public int getVarsta() {
//                return 30;
//            }
//
//            public boolean checkCNP() {
//                return true;
//            }
//        };
//        Companie company = new Companie("Company", fakePerson, 1000);
//        assertTrue(company.verificareLegalitate());
//    }
//
//    @Test
//    public void testMock() {
//        IPersoana mockPerson = mock(IPersoana.class);
//        when(mockPerson.getVarsta()).thenReturn(21);
//        Companie company = new Companie("Company", mockPerson, 1000);
//        assertTrue(company.verificareLegalitate());
//    }
//}
