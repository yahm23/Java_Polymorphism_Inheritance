package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VisitorTest {

    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(15, 1.2, 40.0);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }


}
