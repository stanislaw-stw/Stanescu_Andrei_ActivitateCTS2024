import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PersoanaT {

    @Test
    public void testDummyObject() {
        IPersoana dummy = new PersoanaDummy();
        Companie companie = new Companie(List.of(dummy));
        assertEquals(1, companie.getNumarAngajati());
    }

    @Test
    public void testStub() {
        IPersoana stub = new PersoanaStub();
        assertEquals(25, stub.getVarsta());
        assertTrue(stub.checkCNP());
    }

    @Test
    public void testFake() {
        PersoanaFake fake = new PersoanaFake();
        fake.setSex("F");
        fake.setVarsta(30);
        fake.setCnpValid(true);

        assertEquals("F", fake.getSex());
        assertEquals(30, fake.getVarsta());
        assertTrue(fake.checkCNP());
    }

    @Test
    public void testSpy() {
        PersoanaSpy spy = new PersoanaSpy();
        spy.getVarsta();
        spy.getVarsta();
        assertEquals(2, spy.getGetVarstaCallCount());
    }
}
