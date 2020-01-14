package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedToVisit(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight()> 1.45) {
            return true;
        } else {
            return false;
        }
    }
}
