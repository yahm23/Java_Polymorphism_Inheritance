package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);

        visitor = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(16, 1.2, 40.0);


    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }


    @Test
    public void restrictOlderThan15(){
        assertTrue(playground.isAllowedToVisit(visitor));
        assertFalse(playground.isAllowedToVisit(visitor2));
    }
}
