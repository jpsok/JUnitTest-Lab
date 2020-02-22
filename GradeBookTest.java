import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeBookTest {
    GradeBook g1;

    @Before
    public void setUp() throws Exception {
        g1 = new GradeBook(5);
        g1.addScore(95);
        g1.addScore(87);

    }

    @After
    public void tearDown() throws Exception {
        g1=null;
    }

    @Test
    public void addScore() {
        assertTrue(g1.toString().equals("95.0 87.0"));
    }

    @Test
    public void sum() {
        assertEquals(182, g1.sum(), 0.0001);
    }

    @Test
    public void minimum() {
        assertEquals(87, g1.minimum(), 0.001);
    }

    @Test
    public void finalScore() {
        assertEquals(95, g1.finalScore(), 0.001 );
    }
}