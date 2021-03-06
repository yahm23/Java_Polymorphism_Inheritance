package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 2.1, 40.0);
        visitor2 = new Visitor(15, 1.2, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void rejectShortAndYoung(){
        assertFalse(rollerCoaster.isAllowedToVisit(visitor2));
        assertTrue(rollerCoaster.isAllowedToVisit(visitor));
    }

    @Test
    public void changePrices(){
        assertEquals(16.80, rollerCoaster.priceForVisitor(visitor),0.001);
        assertEquals(8.40, rollerCoaster.priceForVisitor(visitor2),0.001);
    }


}
