import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.List;

public class PersoanaMockTest {

    @Test
    @Category(CustomSuite.class)
    public void testMockGetSex() {
        IPersoana persoanaMock = mock(IPersoana.class);
        when(persoanaMock.getSex()).thenReturn("M");

        assertEquals("M", persoanaMock.getSex());
    }

    @Test
    @Category(CustomSuite.class)
    public void testMockGetVarsta() {
        IPersoana persoanaMock = mock(IPersoana.class);
        when(persoanaMock.getVarsta()).thenReturn(25);

        assertEquals(25, persoanaMock.getVarsta());
    }

    @Test
    @Category(CustomSuite.class)
    public void testMockCheckCNP() {
        IPersoana persoanaMock = mock(IPersoana.class);
        when(persoanaMock.checkCNP()).thenReturn(true);

        assertTrue(persoanaMock.checkCNP());
    }

    @Test
    public void testVerifyMockMethodCall() {
        IPersoana persoanaMock = mock(IPersoana.class);
        persoanaMock.getVarsta();
        verify(persoanaMock).getVarsta();
    }

    @Test
    public void testSpyRealMethod() {
        IPersoana persoanaSpy = spy(new Persoana("Test", "1980712345678"));
        assertEquals("M", persoanaSpy.getSex());
    }

    @Test
    public void testSpyWithStubbedMethod() {
        IPersoana persoanaSpy = spy(new Persoana("Test", "1980712345678"));
        doReturn(30).when(persoanaSpy).getVarsta();
        assertEquals(30, persoanaSpy.getVarsta());
    }

    @Test
    public void testFakeCheckCNP() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setCnpValid(true);
        assertTrue(persoanaFake.checkCNP());
    }

    @Test
    public void testStubGetVarsta() {
        IPersoana persoanaStub = new PersoanaStub();
        assertEquals(25, persoanaStub.getVarsta());
    }

    @Test
    public void testDummyObject() {
        IPersoana dummy = new PersoanaDummy();
        Companie companie = new Companie(List.of(dummy));
        assertEquals(1, companie.getNumarAngajati());
    }

    @Test
    public void testMock() {
        IPersoana mockPersoana = mock(IPersoana.class);

        when(mockPersoana.getVarsta()).thenReturn(33);
        when(mockPersoana.getSex()).thenReturn("M");
        when(mockPersoana.checkCNP()).thenReturn(true);

        assertEquals(33, mockPersoana.getVarsta());
        assertEquals("M", mockPersoana.getSex());
        assertTrue(mockPersoana.checkCNP());

        verify(mockPersoana).getVarsta();
        verify(mockPersoana).getSex();
        verify(mockPersoana).checkCNP();
    }
}
