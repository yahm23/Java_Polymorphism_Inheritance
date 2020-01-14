package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

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

    public double defaultPrice() {
        return 8.40;
    }

    public double priceForVisitor(Visitor visitor) {
       if (visitor.getHeight()>2.0){
           return defaultPrice()*2;
       }
       else {return defaultPrice();}
    }
}
