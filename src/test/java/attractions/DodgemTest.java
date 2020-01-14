package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DodgemTest {

    Dodgems dodgems;

    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);

        visitor = new Visitor(14, 2.1, 40.0);
        visitor2 = new Visitor(11, 1.2, 40.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasPriceVary(){
        assertEquals(4.5,dodgems.priceForVisitor(visitor),0.001);
        assertEquals(2.25,dodgems.priceForVisitor(visitor2),0.001);
    }
}
