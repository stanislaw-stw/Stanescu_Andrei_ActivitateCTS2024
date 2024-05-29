//import static org.mockito.Mockito.*;
//import static org.junit.Assert.*;
//import org.junit.Test;
//import org.mockito.Mockito;
//
//public class PersoanaTest2 {
//
//    @Test
//    public void testGetVarstaUsingWhenThenReturn() {
//        IPersoana persoana = mock(IPersoana.class);
//        when(persoana.getVarsta()).thenReturn(30);
//        assertEquals(30, persoana.getVarsta());
//    }
//
//    @Test
//    public void testGetVarstaUsingDoReturn() {
//        IPersoana persoana = mock(IPersoana.class);
//        doReturn(25).when(persoana).getVarsta();
//        assertEquals(25, persoana.getVarsta());
//    }
//
//    @Test
//    public void testGetVarstaUsingThenAnswer() {
//        IPersoana persoana = mock(IPersoana.class);
//        when(persoana.getVarsta()).thenAnswer(invocation -> 35);
//        assertEquals(35, persoana.getVarsta());
//    }
//
//    @Test
//    public void testGetVarstaUsingDoAnswer() {
//        IPersoana persoana = mock(IPersoana.class);
//        doAnswer(invocation -> 40).when(persoana).getVarsta();
//        assertEquals(40, persoana.getVarsta());
//    }
//
//    @Test(expected = RuntimeException.class)
//    public void testGetVarstaUsingThenThrow() {
//        IPersoana persoana = mock(IPersoana.class);
//        when(persoana.getVarsta()).thenThrow(new RuntimeException("Eroare"));
//        persoana.getVarsta();
//    }
//
//    @Test(expected = RuntimeException.class)
//    public void testGetVarstaUsingDoThrow() {
//        IPersoana persoana = mock(IPersoana.class);
//        doThrow(new RuntimeException("Eroare")).when(persoana).getVarsta();
//        persoana.getVarsta();
//    }
//
//    @Test
//    public void testGetVarstaUsingDoCallRealMethod() {
//        Persoana persoana = mock(Persoana.class);
//        doCallRealMethod().when(persoana).getVarsta();
//        assertEquals(persoana.getVarsta(), new Persoana().getVarsta());
//    }
//}
